public class PesoIdeal {
    private double altura;
    private String genero;


    public PesoIdeal(double altura,String genero) {
        this.altura = altura;
        this.genero = genero;
    }
    public double getAltura(){
        return altura;
    }
    public String getGenero(){
        return genero;
    }
    public void PesoIdealSegunGenero(){
        if (genero=="mujer"||genero=="Mujer"){
            double total=altura-120;
            System.out.println("el peso ideal de una mujer de "+altura+" es "+total);
        }else if (genero=="hombre"||genero=="Hombre"){
            double total=altura-110;
            System.out.println("el peso ideal de un hombre de "+altura+" es "+total);

        } else{
            System.out.println("solo puede poner mayucula en la primera letra o todo minuscula, o escribio mal la palabra");
        }
    }
}
