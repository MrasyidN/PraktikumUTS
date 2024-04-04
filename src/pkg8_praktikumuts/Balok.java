
package pkg8_praktikumuts;


public class Balok {
    
    /*deaklarasi variabel*/
    int panjang;
    int lebar;
    int tinggi;
    
    /*class kontruktor kosong dengan nilai default setiap atribut*/
    Balok(){
        panjang = 1;
        lebar = 1;
        tinggi = 1;
    }
    
    /*class kontruktor dengan nilai spesifik*/
    Balok(int panjangBaru, int lebarBaru, int tinggiBaru){
        panjang = panjangBaru;
        lebar = lebarBaru;
        tinggi = tinggiBaru;
    }
    
    /*menghitung luas dari balok*/
    int getLuas(){
        return 2 * ((panjang * lebar)+(panjang * tinggi)+(lebar * tinggi));
    }
    
    /*menghitung keliling dari balok*/
    int getKeliling(){
        return 4*(panjang + lebar + tinggi);
    }
    
    /*menghitung volume*/
    int getVolume(){
        return panjang * lebar * tinggi;
    }
    
    /*method untuk mengatur panjang balok*/
    void setPanjang(int panjangBaru){
        panjang = panjangBaru;
    }
    
    /*method untuk mengatur lebar balok*/
    void setLebar(int lebarBaru){
        lebar = lebarBaru;
    }
    
    /*method untuk mengatur tinggi balok*/
    void setTinggi(int tinggiBaru){
        tinggi = tinggiBaru;
    }
    
    
    
    public static void main(String []args){
        
        /*inisiasi objek dari balok ke 1*/
        Balok balok1 = new Balok();
        System.out.println("====balok1====");
        System.out.print("Balok dengan panjang :" + balok1.panjang);
        System.out.print(", lebar :" + balok1.lebar);
        System.out.println(" dan tinggi :" + balok1.tinggi);
        System.out.print("Luasnya :" + balok1.getLuas());
        System.out.print(", sedangkan keliling :" + balok1.getKeliling());
        System.out.print(" dan volumenya :" + balok1.getVolume());
        
        System.out.println(" ");
        
        /*inisiasi objek dari balok ke 2*/
        Balok balok2 = new Balok(30, 40, 50);
        System.out.println("====balok2====");
        System.out.print("Balok dengan panjang :" + balok2.panjang);
        System.out.print(", lebar :" + balok2.lebar);
        System.out.println(" dan tinggi :" + balok2.tinggi);
        System.out.print("Luasnya :" + balok2.getLuas());
        System.out.print(", sedangkan keliling :" + balok2.getKeliling());
        System.out.print(" dan volumenya :" + balok2.getVolume());
        
        System.out.println(" ");
        
        /*inisiasi objek apda balok ke 3*/
        Balok balok3 = new Balok(25, 35, 45);
        System.out.println("====balok3====");
        System.out.print("Balok dengan panjang :" + balok3.panjang);
        System.out.print(", lebar :" + balok3.lebar);
        System.out.println(" dan tinggi :" + balok3.tinggi);
        System.out.print("Luasnya :" + balok3.getLuas());
        System.out.print(", sedangkan keliling :" + balok3.getKeliling());
        System.out.print(" dan volumenya :" + balok3.getVolume());
        
        System.out.println(" ");
        
    }
    
    
    
}
