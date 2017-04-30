package homework2;

public class BalloonTester
{
   public static void main(String[] args)
   {
       Balloon balloon = new Balloon();
       balloon.addAir(300);
       
       System.out.printf("\nVolume :" + "%.3f",balloon.getVolume());
       System.out.printf("\nSurfaceArea :" + "%.3f",balloon.getSurfaceArea());
       System.out.printf("\nRadius :" + "%.3f",balloon.getRadius());
       
       
       //System.out.printf("Radius :" + "%.3f",balloon.getRadius());
       //System.out.println("expected: 2.8794119114848606");
       
       //System.out.printf("Volume :" + "%.3f",balloon.getVolume());
       //System.out.println("expected: 100.0");
       
       //System.out.printf("SurfaceArea :" + "%.3f",balloon.getSurfaceArea());
       //System.out.println("expected: 104.18794157356089");
       
       balloon.addAir(300);
       System.out.printf("\n\nVolume :" + "%.3f",balloon.getVolume());
       System.out.printf("\nSurfaceArea :" + "%.3f",balloon.getSurfaceArea());
       System.out.printf("\nRadius :" + "%.3f",balloon.getRadius());
       
       //System.out.printf("Radius after adding air:" + "%.3f",balloon.getRadius());
       //System.out.println("expected: 3.6278316785978095");
       
       //System.out.printf("SurfaceArea after adding air :" + "%.3f",balloon.getSurfaceArea());
       //System.out.println("\n expected: 165.38804805627188");
   }
}