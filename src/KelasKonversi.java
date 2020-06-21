public class KelasKonversi {
    public static String overloadingMeth(int satuan){
        String[] huruf ={"","Satu","Dua","Tiga","Empat","Lima","Enam","Tujuh","Delapan","Sembilan","Sepuluh","Sebelas"};
        String hasil="";
        if (satuan==0){
            hasil = "";
        }else if(satuan<12){
            hasil=hasil+huruf[satuan];
        }else if(satuan<20){
            hasil=hasil+overloadingMeth(satuan-10)+" Belas";
        }else if(satuan<100){
            hasil=hasil+overloadingMeth(satuan/10)+" Puluh "+overloadingMeth(satuan%10);
        }else if(satuan==100){
            System.out.println("seratus");
        }else if(satuan<200){
            hasil=hasil+"Seratus "+overloadingMeth(satuan-100);
        }else if(satuan<1000){
            hasil=hasil+overloadingMeth(satuan/100)+" Ratus "+overloadingMeth(satuan%100);
        }else if(satuan==1000){
            hasil = "Seribu";
        }
        return hasil;
    }

    public void overloadingMeth(String satuan){
        String [] a=satuan.split(" ");
        int hasil = 0;
        if (a.length==1){
            System.out.println(daftar(a[0]));
        }else if (a.length==2){
            if ("belas".equalsIgnoreCase(a[1])){
                System.out.println(daftar(a[0])+10);
            } else if ("puluh".equalsIgnoreCase(a[1])){
                System.out.println(daftar(a[0])*10);
            } else if ("ratus".equalsIgnoreCase(a[1])){
                System.out.println(daftar(a[0])*100);
            }else if ("seratus".equalsIgnoreCase(a[0])){
                System.out.println(100+daftar(a[1]));
            }
        }else if (a.length==3){
            if ("puluh".equalsIgnoreCase(a[1])){
                System.out.println(daftar(a[0])*10+daftar(a[2]));
            }else if ("ratus".equalsIgnoreCase(a[1])){
                System.out.println(daftar(a[0])*100+daftar(a[2]));
            }else if ("sebelas".equalsIgnoreCase(a[2])){
                System.out.println(daftar(a[0])+100);
            } else if ("puluh".equalsIgnoreCase(a[2])){
                System.out.println(100+(daftar(a[1])*10));
            }
        } else if (a.length==4){
            if ("puluh".equalsIgnoreCase(a[3])){
                System.out.println((daftar(a[0])*100)+(daftar(a[2])*10));
            }else if ("belas".equalsIgnoreCase(a[3])){
                System.out.println((daftar(a[0])*100)+(daftar(a[2])+10));
            } else if ("seratus".equalsIgnoreCase(a[0])){
                System.out.println(100+(daftar(a[1])*10)+daftar(a[3]));
            }
        } else if (a.length==5){
            System.out.println((daftar(a[0])*100)+(daftar(a[2])*10)+daftar(a[4]));
        }
    }
    public static int daftar (String kata){
        int jadi =0;
        if ("satu".equalsIgnoreCase(kata)){
            jadi = 1;
        } else if ("dua".equalsIgnoreCase(kata)){
            jadi = 2;
        } else if ("tiga".equalsIgnoreCase(kata)){
            jadi = 3;
        } else if ("empat".equalsIgnoreCase(kata)){
            jadi = 4;
        } else if ("lima".equalsIgnoreCase(kata)){
            jadi = 5;
        } else if ("enam".equalsIgnoreCase(kata)){
            jadi = 6;
        } else if ("tujuh".equalsIgnoreCase(kata)){
            jadi = 7;
        }else if ("delapan".equalsIgnoreCase(kata)){
            jadi = 8;
        } else if ("sembilan".equalsIgnoreCase(kata)){
            jadi = 9;
        } else if ("sepuluh".equalsIgnoreCase(kata)){
            jadi = 10;
        }else if ("sebelas".equalsIgnoreCase(kata)){
            jadi = 11;
        }else if ("seratus".equalsIgnoreCase(kata)){
            jadi = 100;
        }else if ("seribu".equalsIgnoreCase(kata)){
            jadi = 1000;
        }

        return jadi;
    }
}

