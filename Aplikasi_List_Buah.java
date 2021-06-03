//MAIN CLASS
// MEMBUAT APLIKASI LIST BUAH


package aplikasi_sederhana;

// KITA IMPORT INPUT, OUTPUT

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

// IMPORT ARRAYLIST, UNTUK MENGISI DATA
import java.util.ArrayList;

public class ListBuah2 {

// INSTANSIASI OBJEK, BUKAN DI MAIN, AKAN TETAPI MENGGUNAKAN STATIC
static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
static BufferedReader input = new BufferedReader(inputStreamReader);
static ArrayList listBuah = new ArrayList();
static boolean isRunning = true;

static void showMenu() throws IOException {
System.out.println("=======================");
System.out.println("[1] Tampilkan Semua Buah");
System.out.println("[2] Insert Buah");
System.out.println("[3] Edit Buah");
System.out.println("[4] Delete Buah");
System.out.println("[5] Exit");

// MASUKKAN, UNTUK MEMILIH DATA DIATAS
System.out.println("Masukkan Kode Pilihan = ");
int kodePilihan = Integer.valueOf(input.readLine());

// SWITCH CASE UNTUK MENGINISIALISASI KODE DIATAS
switch (kodePilihan) {
case 1:
showAllBuah();
break;
case 2:
insertBuah();
break;
case 3:
editBuah();
break;
case 4:
deleteBuah();
break;
case 5:
exit();
break;
default:
System.out.println("Salah Pilihan");
}
}

static void showAllBuah() {
int count = 1;
if (listBuah.isEmpty()) {
System.out.println("Belum Ada data");
} else {
for (int i = 0; i < listBuah.size(); i++) {
System.out.println(String.format("[%d] %s", count, listBuah.get(i)));
count++;
}
}
}

static void insertBuah() throws IOException {
System.out.print("Masukkan Buah = ");
String buah = input.readLine();

// MENAMBAHKAN BUAH
listBuah.add(buah);
}

static void editBuah() throws IOException {
showAllBuah();
System.out.print("Masukkan Kode Buah = ");
int kodeBuah = Integer.valueOf(input.readLine());

System.out.print("Nama Buah Baru = ");
String namaBaru = input.readLine();

// EDIT BUAH
listBuah.set(kodeBuah, namaBaru);
}

static void deleteBuah() throws IOException {
showAllBuah();
System.out.print("Masukkan Kode Buah untuk dihapus = ");
int kodeBuah = Integer.valueOf(input.readLine());

// HAPUS
listBuah.remove(kodeBuah);
}

static void exit() throws IOException {
System.exit(0);
}



public static void main(String[] args) throws IOException {

do {
showMenu();
} while (isRunning);
}
}



=========================================================================



OUTPUT

=======================
[1] Tampilkan Semua Buah
[2] Insert Buah
[3] Edit Buah
[4] Delete Buah
[5] Exit
Masukkan Kode Pilihan =
