package com.yulia.bqyunadilla;

import android.content.Context;

import com.yulia.bqyunadilla.model.anjing;
import com.yulia.bqyunadilla.model.burung;
import com.yulia.bqyunadilla.model.hewan;
import com.yulia.bqyunadilla.model.kucing;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    private static List<hewan> hewans = new ArrayList<>();

    private static List<kucing> iniDataKucing(Context ctx) {
        List<kucing> kucings = new ArrayList<>();
        kucings.add(new kucing("Angora", "Turki",
                "Aslinya berasal dari Ankara, Turki dengan ciri khas berbulu panjang dan lembut", R.drawable.cat_angora));
        kucings.add(new kucing("Bengal", "Inggris",
                "Merupakan hasil persilangan antara Kucing Leopard Asia dengan kucing domestik Inggris", R.drawable.cat_bengal));
        kucings.add(new kucing("Birmani", "Birma/Myanmar",
                "Konon awalnya merupakan ras kucing yand biasa menemani para biksu yang menetap pada kuil di Birma", R.drawable.cat_birman));
        kucings.add(new kucing("Persia", "Iran",
                "Kucing berbulu panjang dengan wajah bundar dan hidung pesek. Awalnya berasal dari Iran kemudian diimpor ke Italia", R.drawable.cat_persia));
        kucings.add(new kucing("Siam", "Thailand",
                "Kucing hasil turunan dari Wichian Maat (Kucing Thailand) dengan ciri khas berbadan panjang dan langsing, wajah lonjong, telinga lebar, dan mata kebiruan", R.drawable.cat_siam));
        kucings.add(new kucing("Siberia", "Rusia",
                "Kucing domestik Rusia dengan bulu lebat dan badan besar tapi sangat lincah dan terkenal dengan kemampuan melompatnya ", R.drawable.cat_siberian));
        return kucings;
    }

    private static List<anjing> iniDataAnjing(Context ctx) {
        List<anjing> anjings = new ArrayList<>();
        anjings.add(new anjing("Bulldog", "Inggris",
                "Anjing populer yang dikenal dengan badan yang gemuk berotot, wajah seperti kain kusut, dan hidung yang pesek", R.drawable.dog_bulldog));
        anjings.add(new anjing("Husky", "Alaska,Siberia,Finlandia (daerah bersalju) ",
                "Anjing jenis khusus yang awalnya digunakan untuk menarik kereta salju", R.drawable.dog_husky));
        anjings.add(new anjing("Kintamani", "Indonesia",
                "Ras anjing asli pulau Bali ", R.drawable.dog_kintamani));
        anjings.add(new anjing("Samoyed", "Rusia",
                "Anjing yang berasal dari Siberia yang awalnya biasa digunakan untuk menjaga ternak oleh suku Samoyed", R.drawable.dog_samoyed));
        anjings.add(new anjing("Shepherd", "Jerman",
                "Anjing pintar dan kuat, sekarang banyak digunakan sebagai anjing penjaga, pengawal, dan anjing polisi (K9)", R.drawable.dog_shepherd));
        anjings.add(new anjing("Shiba", "Jepang",
                "Anjing dari daerah Shiba ini gesit dan lincah sehingga awalnya banyak digunakan untuk berburu ", R.drawable.dog_shiba));
        return anjings;
    }

    private static List<burung> iniDataBurung(Context ctx) {
        List<burung> burungs = new ArrayList<>();
        burungs.add(new burung("Nuri Bayan", "Indomalaya",
                "Bayan atau betet adalah kelompok burung yang terdiri dari 350 spesies dalam ordo Psittaciformes, yang sering dijumpai di wilayah hangat dan tropis.", R.drawable.nuri_bayan));
        burungs.add(new burung("Merpati", "Indomalaya",
                "erpati dan dara termasuk dalam famili Columbidae atau burung berparuh merpati dari ordo Columbiformes, yang mencakup sekitar 300 spesies burung kerabat pekicau.", R.drawable.merpati));
        burungs.add(new burung("Burung Hantu", "Indonesia",
                "Burung hantu adalah kelompok burung yang merupakan anggota ordo Strigiformes.", R.drawable.burung_hantu));
        burungs.add(new burung("burung Cendrawasih", "Papua,Indonesia",
                "burung Cenderawasih merupakan anggota famili Paradisaeidae dari ordo Passeriformes.", R.drawable.burung_cendrawasih));
        burungs.add(new burung("kolibri", "Amerika Utara dan Amerika Selatan",
                "Kolibri adalah burung kecil dengan panjang 6,4 cm dan berwarna cerah yang sebagian besar hidup di Amerika Utara dan Amerika Selatan.", R.drawable.kolibri));

        return burungs;
    }

    private static void iniAllHewans(Context ctx) {
        hewans.addAll(iniDataKucing(ctx));
        hewans.addAll(iniDataAnjing(ctx));
        hewans.addAll(iniDataBurung(ctx));
    }

    public static List<hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            iniAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<hewan> getHewansByTipe(Context ctx, String jenis) {
        List<hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            iniAllHewans(ctx);
        }
        for (hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }
}
