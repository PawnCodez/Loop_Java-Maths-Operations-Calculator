import java.lang.*;
import java.util.Scanner;
public class MD_Maths_Operations
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Choose any one of the following operations:");
        System.out.println("Enter 1 for Arithmetical Operations.");
        System.out.println("Enter 2 for Power of a Number.");
        System.out.println("Enter 3 for Square Root of a Number.");
        System.out.println("Enter 4 for Cube Root of a Number.");
        System.out.println("Enter 5 for Operations on 2D Shapes.");
        System.out.println("Enter 6 for Operations on 3D Shapes.");
        int ch1= sc.nextInt();
        switch(ch1)
        {
            case 1:
                System.out.println("Choose any one of the following operator:");
                System.out.println("+,-,*,/,%");
                System.out.println("+ → Addition.");
                System.out.println("- → Subtraction.");
                System.out.println("* → Multiplication.");
                System.out.println("/ → Division");
                System.out.println("% → Modulus");
                char ch2= sc.next().charAt(0);
                switch(ch2)
                {
                    case '+':
                        System.out.println("Enter the two numbers.");
                        System.out.println("NOTE: The calculation goes from left to right.");
                        double n1= sc.nextDouble();
                        double n2= sc.nextDouble();
                        System.out.println("SUM= "+(n1+n2));
                        break;
                    case '-':
                        System.out.println("Enter the two numbers.");
                        System.out.println("NOTE: The calculation goes from left to right.");
                        double n3= sc.nextDouble();
                        double n4= sc.nextDouble();
                        System.out.println("DIFFERENCE= "+(n3-n4));
                        break;
                    case '*':
                        System.out.println("Enter the two numbers.");
                        System.out.println("NOTE: The calculation goes from left to right.");
                        double n5= sc.nextDouble();
                        double n6= sc.nextDouble();
                        System.out.println("PRODUCT= "+(n5*n6));
                        break;
                    case '/':
                        System.out.println("Enter the two numbers.");
                        System.out.println("NOTE: The calculation goes from left to right.");
                        double n7= sc.nextDouble();
                        double n8= sc.nextDouble();
                        System.out.println("QUOTIENT= "+(n7/n8));
                        break;
                    case '%':
                        System.out.println("Enter the two numbers.");
                        System.out.println("NOTE: The calculation goes from left to right.");
                        double n9= sc.nextDouble();
                        double n10= sc.nextDouble();
                        System.out.println("MODULUS= "+(n9%n10));
                        break;
                    default:
                        System.out.println("Wrong Input\nPlease Check The Operation.");
                }
                break;

            case 2:
                System.out.println("Enter the base number.");
                double bn= sc.nextDouble();
                System.out.println("Enter the power.");
                double pwr= sc.nextDouble();
                System.out.println("The Result= "+(Math.pow(bn,pwr)));
                break;

            case 3:
                System.out.println("Enter the number.");
                double n11= sc.nextDouble();
                System.out.println("The Square Root= "+(Math.sqrt(n11)));
                break;

            case 4:
                System.out.println("Enter the number.");
                double n12= sc.nextDouble();
                System.out.println("The Cube Root= "+(Math.cbrt(n12)));
                break;

            case 5:
                System.out.println("Choose any one of the following 2D shapes:");
                System.out.println("Enter 1 for Square.");
                System.out.println("Enter 2 for Rectangle.");
                System.out.println("Enter 3 for Triangle.");
                System.out.println("Enter 4 for Rhombus.");
                System.out.println("Enter 5 for Parallelogram.");
                System.out.println("Enter 6 for Trapezium.");
                System.out.println("Enter 7 for Kite.");
                System.out.println("Enter 8 for Circle.");
                int ch3= sc.nextInt();
                switch(ch3)
                {
                    case 1:
                        System.out.println("Enter one of the following operations:");
                        System.out.println("Enter 1 for Perimeter.");
                        System.out.println("Enter 2 for Area.");
                        int ch4= sc.nextInt();
                        switch(ch4)
                        {
                            case 1:
                                System.out.println("Enter the side of the square.");
                                double side1= sc.nextDouble();
                                System.out.println("The Perimeter of the Square= "+(side1*4));
                                break;

                            case 2:
                                System.out.println("Enter the side of the square.");
                                double side2= sc.nextDouble();
                                System.out.println("The Area of the Square= "+(side2*side2));
                                break;

                            default:
                                System.out.println("Wrong Input\nPlease Check The Operation.");
                        }
                        break;

                    case 2:
                        System.out.println("Enter one of the following operations:");
                        System.out.println("Enter 1 for Perimeter.");
                        System.out.println("Enter 2 for Area.");
                        int ch5= sc.nextInt();
                        switch(ch5)
                        {
                            case 1:
                                System.out.println("Enter the length and the breadth of the rectangle respectively.");
                                double l1= sc.nextDouble();
                                double b1= sc.nextDouble();
                                System.out.println("The Perimeter of the Rectangle= "+(2*(l1+b1)));
                                break;

                            case 2:
                                System.out.println("Enter the length and the breadth of the rectangle respectively.");
                                double l2= sc.nextDouble();
                                double b2= sc.nextDouble();
                                System.out.println("The Area of the Rectangle= "+(l2*b2));
                                break;

                            default:
                                System.out.println("Wrong Input\nPlease Check The Operation.");
                        }
                        break;

                    case 3:
                        System.out.println("Enter one of the following operations:");
                        System.out.println("Enter 1 for Perimeter.");
                        System.out.println("Enter 2 for Area.");
                        int ch6= sc.nextInt();
                        switch(ch6)
                        {
                            case 1:
                                System.out.println("Enter the three sides of the triangle.");
                                double st1= sc.nextDouble();
                                double st2= sc.nextDouble();
                                double st3= sc.nextDouble();
                                System.out.println("The Perimeter of the Triangle= "+(st1+st2+st3));
                                break;

                            case 2:
                                System.out.println("Enter the height and the base of the triangle respectively.");
                                double ht1= sc.nextDouble();
                                double bs1= sc.nextDouble();
                                System.out.println("The Area of the Triangle= "+(0.5*ht1*bs1));
                                break;

                            default:
                                System.out.println("Wrong Input\nPlease Check The Operation.");
                        }
                        break;

                    case 4:
                        System.out.println("Enter one of the following operations:");
                        System.out.println("Enter 1 for Perimeter.");
                        System.out.println("Enter 2 for Area.");
                        int ch7= sc.nextInt();
                        switch(ch7)
                        {
                            case 1:
                                System.out.println("Enter the side of the rhombus.");
                                double sr1= sc.nextDouble();
                                System.out.println("The Perimeter of the Rhombus= "+(4*sr1));
                                break;

                            case 2:
                                System.out.println("Enter both the diagonals of the rhombus.");
                                double d1= sc.nextDouble();
                                double d2= sc.nextDouble();
                                System.out.println("The Area of the Rhombus= "+(0.5*d1*d2));
                                break;

                            default:
                                System.out.println("Wrong Input\nPlease Check The Operation.");
                        }
                        break;

                    case 5:
                        System.out.println("Enter one of the following operations:");
                        System.out.println("Enter 1 for Perimeter.");
                        System.out.println("Enter 2 for Area.");
                        int ch8= sc.nextInt();
                        switch(ch8)
                        {
                            case 1:
                                System.out.println("Enter the length and the breadth of the parallelogram respectively.");
                                double lp= sc.nextDouble();
                                double bp= sc.nextDouble();
                                System.out.println("The Perimeter of the Parallelogram= "+(2*(lp+bp)));
                                break;

                            case 2:
                                System.out.println("Enter the base and the corresponding height of the parallelogram respectively.");
                                double bsp= sc.nextDouble();
                                double chp= sc.nextDouble();
                                System.out.println("The Area of the Parallelogram= "+(bsp*chp));
                                break;

                            default:
                                System.out.println("Wrong Input\nPlease Check The Operation.");
                        }
                        break;

                    case 6:
                        System.out.println("Enter one of the following operations:");
                        System.out.println("Enter 1 for Perimeter.");
                        System.out.println("Enter 2 for Area.");
                        int ch9= sc.nextInt();
                        switch(ch9)
                        {
                            case 1:
                                System.out.println("Enter the 4 sides of the trapezium.");
                                double st1= sc.nextDouble();
                                double st2= sc.nextDouble();
                                double st3= sc.nextDouble();
                                double st4= sc.nextDouble();
                                System.out.println("The Perimeter of the Trapezium= "+(st1+st2+st3+st4));
                                break;

                            case 2:
                                System.out.println("Enter the height and the two parallel sides of the trapezium respectively.");
                                double ht= sc.nextDouble();
                                double p1t= sc.nextDouble();
                                double p2t= sc.nextDouble();
                                System.out.println("The Area of the Trapezium= "+(0.5*(p1t+p2t)*ht));
                                break;

                            default:
                                System.out.println("Wrong Input\nPlease Check The Operation.");
                        }
                        break;

                    case 7:
                        System.out.println("Enter one of the following operations:");
                        System.out.println("Enter 1 for Perimeter.");
                        System.out.println("Enter 2 for Area.");
                        int ch10= sc.nextInt();
                        switch(ch10)
                        {
                            case 1:
                                System.out.println("Enter the length and breadth of the kite respectively.");
                                double lk= sc.nextDouble();
                                double bk= sc.nextDouble();
                                System.out.println("The Perimeter of the Kite= "+(2*(lk+bk)));
                                break;

                            case 2:
                                System.out.println("Enter both the diagonals of the kite.");
                                double d3= sc.nextDouble();
                                double d4= sc.nextDouble();
                                System.out.println("The Area of the Kite= "+(0.5*d3*d4));
                                break;

                            default:
                                System.out.println("Wrong Input\nPlease Check The Operation.");
                        }
                        break;

                    case 8:
                        System.out.println("Enter one of the following operations:");
                        System.out.println("Enter 1 for Circumference.");
                        System.out.println("Enter 2 for Area.");
                        int ch11= sc.nextInt();
                        switch(ch11)
                        {
                            case 1:
                                System.out.println("Enter the radius of the circle.");
                                double radc1= sc.nextDouble();
                                System.out.println("The Circumference of the Circle= "+(2*Math.PI*radc1));
                                break;

                            case 2:
                                System.out.println("Enter the radius of the circle.");
                                double radc2= sc.nextDouble();
                                System.out.println("The Area of the Circle= "+(Math.PI*radc2*radc2));
                                break;

                            default:
                                System.out.println("Wrong Input\nPlease Check The Operation.");
                        }
                        break;

                    default:
                        System.out.println("Wrong Input\nPlease Check The Operation.");
                }

            case 6:
                System.out.println("Choose any one of the following 3D shapes:");
                System.out.println("Enter 1 for Cube.");
                System.out.println("Enter 2 for Cuboid.");
                System.out.println("Enter 3 for Cylinder.");
                System.out.println("Enter 4 for Cone.");
                System.out.println("Enter 5 for Sphere.");
                System.out.println("Enter 6 for Hemisphere.");
                int ch12= sc.nextInt();
                switch(ch12)
                {
                    case 1:
                        System.out.println("Choose any one of the following operations:");
                        System.out.println("Enter 1 for Volume.");
                        System.out.println("Enter 2 for Total Surface Area.");
                        System.out.println("Enter 3 for Lateral Surface Area.");
                        int ch13= sc.nextInt();
                        switch(ch13)
                        {
                            case 1:
                                System.out.println("Enter the edge of the cube.");
                                double edge1= sc.nextDouble();
                                System.out.println("The Volume of the Cube= "+(Math.pow(edge1,3)));
                                break;
                            case 2:
                                System.out.println("Enter the edge of the cube.");
                                double edge2= sc.nextDouble();
                                System.out.println("The Total Surface Area of the Cube= "+(6*edge2*edge2));
                                break;  
                            case 3:
                                System.out.println("Enter the edge of the cube.");
                                double edge3= sc.nextDouble();
                                System.out.println("The Lateral Surface Area of the Cube= "+(4*edge3*edge3));
                                break;

                            default:
                                System.out.println("Wrong Input\nPlease Check The Operation.");
                        }
                        break;

                    case 2:
                        System.out.println("Choose any one of the following operations:");
                        System.out.println("Enter 1 for Volume.");
                        System.out.println("Enter 2 for Total Surface Area.");
                        System.out.println("Enter 3 for Lateral Surface Area.");
                        int ch14= sc.nextInt();
                        switch(ch14)
                        {
                            case 1:
                                System.out.println("Enter the length, breadth and height of the cuboid.");
                                double lcu1= sc.nextDouble();
                                double bcu1= sc.nextDouble();
                                double hcu1= sc.nextDouble();
                                System.out.println("The Volume of the Cuboid= "+(lcu1*bcu1*hcu1));
                                break;
                            case 2:
                                System.out.println("Enter the length, breadth and height of the cube.");
                                double lcu2= sc.nextDouble();
                                double bcu2= sc.nextDouble();
                                double hcu2= sc.nextDouble();
                                System.out.println("The Total Surface Area of the Cuboid= "+(2*((lcu2*bcu2)+(bcu2*hcu2)+(lcu2*hcu2))));
                                break;  
                            case 3:
                                System.out.println("Enter the length, breadth and height of the cube.");
                                double lcu3= sc.nextDouble();
                                double bcu3= sc.nextDouble();
                                double hcu3= sc.nextDouble();
                                System.out.println("The Lateral Surface Area of the Cuboid= "+(2*(lcu3+bcu3)*hcu3));
                                break;

                            default:
                                System.out.println("Wrong Input\nPlease Check The Operation.");
                        }
                        break;

                    case 3:
                        System.out.println("Choose any one of the following operations:");
                        System.out.println("Enter 1 for Volume.");
                        System.out.println("Enter 2 for Total Surface Area.");
                        System.out.println("Enter 3 for Curved Surface Area.");
                        int ch15= sc.nextInt();
                        switch(ch15)
                        {
                            case 1:
                                System.out.println("Enter the radius and height of the cylinder.");
                                double radcy1= sc.nextDouble();
                                double hcy1= sc.nextDouble();
                                System.out.println("The Volume of the Cylinder= "+(Math.PI*radcy1*radcy1*hcy1));
                                break;
                            case 2:
                                System.out.println("Enter the radius and height of the cylinder.");
                                double radcy2= sc.nextDouble();
                                double hcy2= sc.nextDouble();
                                System.out.println("The Total Surface Area of the Cylinder= "+(2*Math.PI*radcy2*(hcy2+radcy2)));
                                break;  
                            case 3:
                                System.out.println("Enter the radius and height of the cylinder.");
                                double radcy3= sc.nextDouble();
                                double hcy3= sc.nextDouble();
                                System.out.println("The Curved Surface Area of the Cylinder= "+(2*Math.PI*radcy3*hcy3));
                                break;

                            default:
                                System.out.println("Wrong Input\nPlease Check The Operation.");
                        }
                        break;

                    case 4:
                        System.out.println("Choose any one of the following operations:");
                        System.out.println("Enter 1 for Volume.");
                        System.out.println("Enter 2 for Total Surface Area.");
                        System.out.println("Enter 3 for Curved Surface Area.");
                        int ch16= sc.nextInt();
                        switch(ch16)
                        {
                            case 1:
                                System.out.println("Enter the radius and height of the cone.");
                                double radco1= sc.nextDouble();
                                double hco1= sc.nextDouble();
                                System.out.println("The Volume of the Cone= "+(1.0/3.0*Math.PI*radco1*radco1*hco1));
                                break;
                            case 2:
                                System.out.println("Enter the radius and slant height of the cone.");
                                double radco2= sc.nextDouble();
                                double shco1= sc.nextDouble();
                                System.out.println("The Total Surface Area of the Cone= "+(Math.PI*radco2*(radco2+shco1)));
                                break;  
                            case 3:
                                System.out.println("Enter the radius and slant height of the cone.");
                                double radco3= sc.nextDouble();
                                double shco2= sc.nextDouble();
                                System.out.println("The Curved Surface Area of the Cone= "+(Math.PI*radco3*shco2));
                                break;

                            default:
                                System.out.println("Wrong Input\nPlease Check The Operation.");
                        }
                        break;

                    case 5:
                        System.out.println("Choose any one of the following operations:");
                        System.out.println("Enter 1 for Volume.");
                        System.out.println("Enter 2 for Surface Area.");
                        int ch17= sc.nextInt();
                        switch(ch17)
                        {
                            case 1:
                                System.out.println("Enter the radius of the sphere.");
                                double rads1= sc.nextDouble();
                                System.out.println("The Volume of the Sphere= "+(4.0/3.0*Math.PI*Math.pow(rads1,3)));
                                break;
                            case 2:
                                System.out.println("Enter the radius of the sphere.");
                                double rads2= sc.nextDouble();
                                System.out.println("The Surface Area of the Sphere= "+(4*Math.PI*rads2*rads2));
                                break;

                            default:
                                System.out.println("Wrong Input\nPlease Check The Operation.");
                        }
                        break;

                    case 6:
                        System.out.println("Choose any one of the following operations:");
                        System.out.println("Enter 1 for Volume.");
                        System.out.println("Enter 2 for Curved Surface Area.");
                        System.out.println("Enter 3 for Total Surface Area");
                        int ch18= sc.nextInt();
                        switch(ch18)
                        {
                            case 1:
                                System.out.println("Enter the radius of the hemisphere.");
                                double radhs1= sc.nextDouble();
                                System.out.println("The Volume of the Hemisphere= "+(2.0/3.0*Math.PI*Math.pow(radhs1,3)));
                                break;
                            case 2:
                                System.out.println("Enter the radius of the hemisphere.");
                                double radhs2= sc.nextDouble();
                                System.out.println("The Cuved Surface Area of the Hemisphere= "+(2*Math.PI*radhs2*radhs2));
                                break;
                            case 3:
                                System.out.println("Enter the radius of the hemisphere.");
                                double radhs3= sc.nextDouble();
                                System.out.println("The Total Surface Area of the Hemisphere= "+(3*Math.PI*radhs3*radhs3));
                                break;

                            default:
                                System.out.println("Wrong Input\nPlease Check The Operation.");
                        }
                        break;

                    default:
                        System.out.println("Wrong Input\nPlease Check The Operation.");
                }
                break;

            default:
                System.out.println("Wrong Input\nPlease Check The Operation.");
        }
    }
}