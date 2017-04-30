package homework2;

public class Balloon
{
        private double volume;
        private double radius;

        /**
        * Constructs an empty balloon
        */
        public Balloon()
        {
           this.volume = 0;
           this.radius = 0;
        }

        /**
        @amount add a given amount of air to the balloon
        */
        public void addAir(double amount)
        {
            volume = volume + amount;
            radius = Math.pow((3.0 * volume) / (4 * Math.PI),1.0/3); 
            //radius=  Math.pow(((volume/ Math.PI)*(3/4)),1.0/3);   
            // radius from the volume. ((V/π)(3/4))1/3 = r,
            // radius from the surface area. r = √(A/(4π)).
        }
        

        /**
        returns the current volume of the balloon
        */
        public double getVolume()
        {
            return volume;
        }
    
        /**
        returns the current surface area of the balloon
        */
        public double getSurfaceArea()
        {
        	return (4.0 * Math.PI * Math.pow(radius,2));
        	//return ((4.0/3.0) * Math.PI * Math.pow(radius,3)); //(4/3)πr^3
        }
    
        /**
        returns the current radius of the balloon
        */
        public double getRadius()
        {
            return radius;
        }
}