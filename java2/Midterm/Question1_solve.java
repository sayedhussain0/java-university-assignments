public class Question1_solve {
    public static void checkTriangle(Triangle[] list) {


        int E = 0, I = 0, S = 0;

        for (int i = 0; i < list.length; i++)
        {

            if(list[i].getA() == list[i].getB() && list[i].getB() == list[i].getC()){
                E++;
            }
            else if (list[i].getA() == list[i].getB() || list[i].getB() == list[i].getC() || list[i].getC() == list[i].getA()){
                I++;
            }
            else {
                S++;
            }
        }

        System.out.println("Number of Equilateral Triangles = " + E);
        System.out.println("Isosceles Triangles = " + I);
        System.out.println("Isosceles Triangle = " + S);
    }
}
