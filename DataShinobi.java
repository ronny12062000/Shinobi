class shinobi{
  public String No_registrasi, nama, peringkat;

  public void setNoRegistrasi (String No_registrasi){
    this.No_registrasi = No_registrasi;
  }
  public String getNoRegistrasi (){
    return No_registrasi;
  }

  public void setNama (String nama){
    this.nama = nama;
  }
  public String getNama (){
    return nama;
  }

  public void setPeringkat (String peringkat){
    this.peringkat = peringkat;
  }
  public String getPeringkat (){
    return peringkat;
  }
}

public class DataShinobi{
  public static void main(String[] args){
    shinobi[] shinobiNew = new shinobi[3];

    shinobiNew[0] = new shinobi();
    shinobiNew[0].setNoRegistrasi("012606");
    shinobiNew[0].setNama("Uchiha Sasuke");
    shinobiNew[0].setPeringkat("Genin");


    shinobiNew[1] = new shinobi();
    shinobiNew[1].setNoRegistrasi("012607");
    shinobiNew[1].setNama("Uzumaki Naruto");
    shinobiNew[1].setPeringkat("Genin");

    shinobiNew[2] = new shinobi();
    shinobiNew[2].setNoRegistrasi("012601");
    shinobiNew[2].setNama("Haruno Sakura");
    shinobiNew[2].setPeringkat("Chunin");
     System.out.println();
    System.out.println("Data para shinobi \n");
    for(shinobi a:shinobiNew){
      System.out.println("==================");
      System.out.println("No. Registrasi : " +a.getNoRegistrasi());
      System.out.println("Nama : " +a.getNama());
      System.out.println("Peringkat : " +a.getPeringkat());
      System.out.println("==================");
      System.out.println();
    }
  }
}
