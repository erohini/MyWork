package proxyserver;


import java.util.*;

/// A dictionary with wildcard lookups.
// <P>
// The keys in this dictionary are wildcard patterns.  When you do a get(),
// the string you pass in is matched against all the patterns, and the
// first match is returned.
// <P>
// The wildcard matcher is fairly simple, it implements * meaning any
// string, ? meaning any single character, and | separating multiple
// patterns.  All other characters must match literally.

public class WildcardDictionary extends Dictionary implements java.io.Serializable
    {

    private Vector keys;
    private Vector elements;

    /// Constructor.
    public WildcardDictionary()
	{
	keys = new Vector();
	elements = new Vector();
	}

    /// Returns the number of elements contained within the dictionary.
    public int size()
	{
	return elements.size();
	}

    /// Returns true if the dictionary contains no elements.
    public boolean isEmpty()
	{
	return size() == 0;
	}

    /// Returns an enumeration of the dictionary's keys.
    public Enumeration keys()
	{
	return keys.elements();
	}

    /// Returns an enumeration of the elements. Use the Enumeration methods
    // on the returned object to fetch the elements sequentially.
    public Enumeration elements()
	{
	return elements.elements();
	}

    /// Gets the object associated with the specified key in the dictionary.
    // The key is assumed to be a String, which is matched against
    // the wildcard-pattern keys in the dictionary.
    // @param key the string to match
    // @returns the element for the key, or null if there's no match
    public synchronized Object get( Object key )
	{
	String sKey = (String) key;
	for ( int i = 0; i < keys.size(); ++i )
	    {
	    String thisKey = (String) keys.elementAt( i );
	    if ( match( thisKey, sKey ) )
		return elements.elementAt( i );
	    }
	return null;
	}

    /// Puts the specified element into the Dictionary, using the specified
    // key.  The element may be retrieved by doing a get() with the same
    // key.  The key and the element cannot be null.
    // @param key the specified wildcard-pattern key
    // @param value the specified element
    // @return the old value of the key, or null if it did not have one.
    // @exception NullPointerException If the value of the specified
    // element is null.
    public synchronized Object put( Object key, Object element )
	{
	int i = keys.indexOf( key );
	if ( i != -1 )
	    {
	    Object oldElement = elements.elementAt( i );
	    elements.setElementAt( element, i );
	    return oldElement;
	    }
	else
	    {
	    keys.addElement( key );
	    elements.addElement( element );
	    return null;
	    }
	}

    /// Removes the element corresponding to the key. Does nothing if the
    // key is not present.
    // @param key the key that needs to be removed
    // @return the value of key, or null if the key was not found.
    public synchronized Object remove( Object key )
	{
	int i = keys.indexOf( key );
	if ( i != -1 )
	    {
	    Object oldElement = elements.elementAt( i );
	    keys.removeElementAt( i );
	    elements.removeElementAt( i );
	    return oldElement;
	    }
	else
	    return null;
	}

       /** Checks whether a string matches a given wildcard pattern.
        * Only does ? and *, and multiple patterns separated by |.
        */
        public static boolean match( String pattern, String string )
	{
	for ( int p = 0; ; ++p )
	    {
	    for ( int s = 0; ; ++p, ++s )
		{
		boolean sEnd = ( s >= string.length() );
		boolean pEnd = ( p >= pattern.length() ||
				 pattern.charAt( p ) == '|' );
		if ( sEnd && pEnd )
		    return true;
		if ( sEnd || pEnd )
		    break;
		if ( pattern.charAt( p ) == '?' )
		    continue;
		if ( pattern.charAt( p ) == '*' )
		    {
		    int i;
		    ++p;
		    for ( i = string.length(); i >= s; --i )
			if ( match(
			       pattern.substring( p ),
			       string.substring( i ) ) )  /* not quite right */
			    return true;
		    break;
		    }
		if ( pattern.charAt( p ) != string.charAt( s ) )
		    break;
		}
	    p = pattern.indexOf( '|', p );
	    if ( p == -1 )
		return false;
	    }
	}
        /**
         * Deletes all elements and keys.
         */
        public void removeAllElements()
        {
          elements.clear();
          keys.clear();
        }
    }
