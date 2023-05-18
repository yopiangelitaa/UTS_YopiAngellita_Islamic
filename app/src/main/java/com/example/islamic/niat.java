package com.example.islamic;

import android.os.Bundle;
import android.widget.ExpandableListView;

import androidx.appcompat.app.AppCompatActivity;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class niat extends AppCompatActivity{


    ExpandableListViewAdapter listViewAdapter;
    ExpandableListView expandableListView;
    List<String> chapterList;
    HashMap<String,List<String>> topicList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_dropdown);

        expandableListView = findViewById(R.id.elistview);
        showList();

        listViewAdapter = new ExpandableListViewAdapter(this, chapterList, topicList);
        expandableListView.setAdapter(listViewAdapter);


    }private void showList() {
        chapterList = new ArrayList<String>();
        topicList = new HashMap<String, List<String>>();

        chapterList.add("Niat Sholat Subuh");
        List<String> topic1 = new ArrayList<>();
        topic1.add("أُصَلِّى فَرْضَ الصُّبْح رَكَعتَيْنِ مُسْتَقْبِلَ الْقِبْلَةِ أَدَاءً (مَأْمُوْمًا/إِمَامًا) لله تَعَالَى\nِ"+
                "\n" +
                "\"“Ushalli fardhas subhi rak’ataini mustqbilal qiblati adaa-an (ma’mumam/imaaman) lillaahi ta’aalaa.”\"" +"\n" +
                "Artinya:Saya berniat sholat fardu subuh dua rakaat menghadap kiblat karena Allah Ta'ala/Ma'mum karena Allah Ta'ala/Imam karena Allah Ta'ala");


        chapterList.add("Niat Sholat Zuhur");
        List<String> topic2 = new ArrayList<>();
        topic2.add("اُصَلِّيْ فَرْضَ الظُّهْرِ أَرْبَعَ رَكَعاَتٍ مُسْتَقْبِلَ الْقِبْلَةِ أَدَاءً (مَأْمُوْمًا/إِمَامًا) لله تَعَالَى\n" +
                "\n" +
                "\"Ushalli fardhadz dzuhri arba’a raka’aatin mustqbilal qiblati adaa-an (ma’mumam/imaaman) lillaahi ta’aalaa.\"" +"\n" +
                "\n" +
                "Artinya:Saya berniat sholat fardu zuhur empat rakaat menghadap kiblat karena Allah Ta'ala/Ma'mum karena Allah Ta'ala/Imam karena Allah Ta'ala.");

        chapterList.add("Niat Sholat Ashar");
        List<String> topic3 = new ArrayList<>();
        topic3.add("ُصَلِّى فَرْضَ العَصْرِأَرْبَعَ رَكَعاَتٍ مُسْتَقْبِلَ الْقِبْلَةِ أَدَاءً (مَأْمُوْمًا/إِمَامًا) لله تَعَالَىَ\n" +
                "\n" +
                "\"Ushalli fardhal ashri arba’a raka’aatin mustqbilal qiblati adaa-an (ma’mumam/imaaman) lillaahi ta’aalaa.”\"" +"\n" +
                "\n" +
                "Artinya:aya berniat sholat fardu asar empat rakaat menghadap kiblat karena Allah Ta'ala/Ma'mum karena Allah Ta'ala/Imam karena Allah Ta'ala.");

        chapterList.add("Niat Sholat Maghrib");
        List<String> topic4 = new ArrayList<>();
        topic4.add("صَلِّى فَرْضَ المَغْرِبِ ثَلاَثَ رَكَعاَتٍ مُسْتَقْبِلَ الْقِبْلَةِ أَدَاءً (مَأْمُوْمًا/إِمَامًا) لله تَعَالِ\n" +
                "\n" +
                "\"Ushalli fardhal maghribi salasa’ raka’aatin mustqbilal qiblati adaa-an (ma’mumam/imaaman) lillaahi ta’aalaa.”\"" +"\n" +
                "Dengan menyebut nama Allah. Ya Allah, aku berlindung kepada-Mu dari jin perempuan dan laki-laki yang tidak baik.");

        chapterList.add("Niat Sholat Isya");
        List<String> topic5 = new ArrayList<>();
        topic5.add("أُصَلِّى فَرْضَ العِشَاء ِأَرْبَعَ رَكَعاَتٍ مُسْتَقْبِلَ الْقِبْلَةِ أَدَاءً (مَأْمُوْمًا/إِمَامًا) لله تَعَالَىََ\n" +
                "\n" +
                "\"Ushalli fardhal ‘isyaa-i raka’aatin mustqbilal qiblati adaa-an (ma’mumam/imaaman) lillaahi ta’aalaa.\"" +"\n" +
                "Artinya: \"Saya berniat sholat fardu isya empat rakaat menghadap kiblat karena Allah Ta'ala/Ma'mum karena Allah Ta'ala/Imam karena Allah Ta'ala\" .\n");

        chapterList.add("Niat sholat tahajud");
        List<String> topic6 = new ArrayList<>();
        topic6.add("صَلِّى سُنَّةً التَّهَجُّدِ رَكْعَتَيْنِ مُسْتَقْبِلَ الْقِبْلَةِ ِللهِ تَعَالَ\n" +
                "\n" +
                "\"Ushallii sunnatan tahajjudi rak'ataini mustaqbilal qiblati lillahi ta'alla.\"" +"\n" +
                "Artinya:Aku niat sholat sunat tahajud 2 rakaat, menghadap kiblat, karena Allah Ta'ala.\n");

        chapterList.add("Niat sholat hajat");
        List<String> topic7 = new ArrayList<>();
        topic7.add("اُصَلِّى سُنَّةَ الْحَاجَةِ رَكْعَتَيْنِ لِلهِ تَعَالَى\n" +
                "\n" +
                "\"Ushallī sunnatal hājati rak‘ataini adā’an lillāhi ta‘ālā.\"" +"\n" +
                "Artinya: Aku menyengaja shalat sunnah hajat dua rakaat tunai karena Allah SWT.\n");

        chapterList.add("Niat sholat dhuha");
        List<String> topic8 = new ArrayList<>();
        topic8.add("اُصَلِّى سُنَّةَ الضَّحٰى رَكْعَتَيْنِ مُسْتَقْبِلَ الْقِبْلَةِ اَدَاءً ِللهِ تَعَالَى\n" +
                "\n" +
                "\"Ushalli Sunnatadh-dhuhaa rak'ataini lillaahi ta'aalaa.\"" +"\n" +
                "Artinya: Aku niat sholat sunat dhuha dua rakaat, karena Allah ta'ala");


        chapterList.add("Niat sholat witir");
        List<String> topic9 = new ArrayList<>();
        topic9.add("اُصَلِّى سُنَّةَ الْوِتْرِ ثَلَاثَ رَكْعَاتٍ مُسْتَقْبِلَ الْقِبْلَةِ أَدَاءً لِلهِ تَعَالَى\n" +
                "\n" +
                "\"Ushalli sunnatal witri tsalâtsa raka'âtin mustaqbilal qiblati adâ'an lillâhi ta'âlâ\"" +"\n" +
                "Artinya: Aku menyengaja sholat sunnah shalat witir tiga rakaat dengan menghadap kiblat, karena Allah Ta'ala.");


        chapterList.add("Niat sholat tarawih Imam");
        List<String> topic10 = new ArrayList<>();
        topic10.add("ُصَلِّى سُنَّةَ التَّرَاوِيْحِ رَكْعَتَيْنِ مُسْتَقْبِلَ الْقِبْلَةِ أَدَاءً إِمَامًا ِللهِ تَعَالَىُ\n" +
                "\n" +
                "\"Ushalli sunnatat Tarāwīhi rak‘atayni mustaqbilal qiblati adā’an imāman lillāhi ta‘ālā.\"" +"\n" +
                "Artinya: Aku menyengaja sembahyang sunnah Tarawih dua rakaat dengan menghadap kiblat, tunai sebagai imam karena Allah SWT.");


        chapterList.add("Niat sholat tarawih makmum");
        List<String> topic11 = new ArrayList<>();
        topic11.add("اُصَلِّى سُنَّةَ التَّرَاوِيْحِ رَكْعَتَيْنِ مُسْتَقْبِلَ الْقِبْلَةِ أَدَاءً مَأْمُوْمًا لِلهِ تَعَالَى\n" +
                "\n" +
                "\"Ushalli sunnatat Tarāwīhi rak‘atayni mustaqbilal qiblati adā’an ma’mūman lillāhi ta‘ālā.\"" +"\n" +
                "Artinya: Aku menyengaja sembahyang sunnah Tarawih dua rakaat dengan menghadap kiblat, tunai sebagai makmum karena Allah SWT. ");


        chapterList.add("Niat Sholat Taubat");
        List<String> topic12 = new ArrayList<>();
        topic12.add("وَيْتُ الصَّلاَةَ سُنَّةَ التَّوْبَةِ رَكْعَتَيْنِ لِلَّهِ تَعَالَىَ\n" +
                "\n" +
                "\"Nawaitu shalata sunnata taubatin rak’ataini lillahi ta’ala\"" +"\n" +
                "\n" +
                "Artinya: Saya niat sholat sunah tobat dua rakaat karena Allah. \n");



        topicList.put(chapterList.get(0), topic1);
        topicList.put(chapterList.get(1), topic2);
        topicList.put(chapterList.get(2), topic3);
        topicList.put(chapterList.get(3), topic4);
        topicList.put(chapterList.get(4), topic5);
        topicList.put(chapterList.get(5), topic6);
        topicList.put(chapterList.get(6), topic7);
        topicList.put(chapterList.get(7), topic8);
        topicList.put(chapterList.get(8), topic9);
        topicList.put(chapterList.get(9), topic10);
        topicList.put(chapterList.get(10), topic11);
        topicList.put(chapterList.get(11), topic12);


    }

}