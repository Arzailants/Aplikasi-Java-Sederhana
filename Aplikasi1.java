//MAIN CLASS
// MEMBUAT APLIKASI KELILING LINGKARAN


package coretan.coretan1;

public class Coretan1{
  
// MEMBUAT KONSTANTA
public static final double PHI = 3.14;

// MEMBUAT METHOD TES
static void test(){
// INSTANSIASI OBJEK, LANGSUNG DI METHODNYA

double radius = 100;

// MENAMPILKAN METHOD 1
System.out.println("Keliling lingkaran berjari-jari " +radius+ " adalah " +aFirstMethod(radius));

// MENAMPILKAN METHOD 2
System.out.println("Keliling lingkaran berjari-jari " +radius+ " adalah " +aSecondMethod(radius));

}

public static void main(String[] args) {

// MEMANGGIL METHOD
test();

}

// MEMBUAT METHOD UNTUK PERHITUNGANNYA
static double aFirstMethod(double param){
return (2 * PHI * param);
}

static double aSecondMethod(double param){
return (PHI * param * param);
}
}


//OUTPUT

//Keliling lingkaran berjari-jari 100.0 adalah 628.0
//Keliling lingkaran berjari-jari 100.0 adalah 31400.0
