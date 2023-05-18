package com.example.islamic;



import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class doa extends AppCompatActivity{


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


    }

    private void showList() {
        chapterList = new ArrayList<String>();
        topicList = new HashMap<String, List<String>>();

        chapterList.add("Doa Makan");
        List<String> topic1 = new ArrayList<>();
        topic1.add("\nاللَّهُمَّ بَارِكْ لَنَا فِيمَا رَزَقْتَنَا وَقِنَا عَذَابَ النَّارِ"+
                "\n" +
                "\"Allahumma barik lana fi ma razaqtana waqina 'adhaban-nar.\"" +"\n" +
                "Artinya: Ya Allah, berkahilah rezeki yang Engkau berikan kepada kami dan peliharalah kami dari siksa api neraka.");

        chapterList.add("Doa Setelah Makan");
        List<String> topic2 = new ArrayList<>();
        topic2.add("ابِسْمِ اللَّهِ الرَّحْمَٰنِ الرَّحِيمِ. الْحَمْدُ لِلَّهِ الَّذِي أَطْعَمَنَا وَسَقَانَا، وَجَعَلَنَا مُسْلِمِينَ\n" +
                "\n" +
                "\"Bismillah-ir-Rahmanir-Rahim. Alhamdu lillahi l-ladhi at'amanā wa saqānā, wa ja'alnā muslimīn.\"" +"\n" +
                "Artinya: Dengan menyebut nama Allah Yang Maha Pengasih, Maha Penyayang. Segala puji bagi Allah yang memberi makan kami dan minuman kami, serta menjadikan kami sebagai orang-orang yang berserah diri.");

        chapterList.add("Doa Masuk Masjid");
        List<String> topic3 = new ArrayList<>();
        topic3.add("سْمِ اللَّهِ وَالصَّلَاةُ وَالسَّلَامُ عَلَى رَسُولِ اللَّهِ، اللَّهُمَّ افْتَحْ لِي أَبْوَابَ رَحْمَتِكَ\n" +
                "\n" +
                "\"Bismillāhi waṣ-ṣalātu wa s-salāmu 'alā Rasūlillāh, allāhumma iftaḥ lī abwāba raḥmatika.\"" +"\n" +
                "Artinya: \n" +
                "Dengan menyebut nama Allah, semoga shalawat dan salam tercurah kepada Rasulullah. Ya Allah, bukakanlah untukku pintu-pintu rahmat-Mu.\n");

        chapterList.add("Doa Keluar Masjid");
        List<String> topic4 = new ArrayList<>();
        topic4.add("ِسْمِ اللَّهِ وَالصَّلَاةُ وَالسَّلَامُ عَلَى رَسُولِ اللَّهِ، اللَّهُمَّ إِنِّي أَسْأَلُكَ مِنْ فَضْلِكَ\n" +
                "\n" +
                "\"Bismillāhi waṣ-ṣalātu wa s-salāmu 'alā Rasūlillāh, allāhumma innī as-aluka min faḍlika.\n\"" +
                "Artinya: \n" +
                "Dengan menyebut nama Allah, semoga shalawat dan salam tercurah kepada Rasulullah. Ya Allah, sesungguhnya aku memohon kepada-Mu dari limpahan karunia-Mu.");

        chapterList.add("Doa Masuk WC");
        List<String> topic5 = new ArrayList<>();
        topic5.add("َبِسْمِ اللَّهِ اللَّهُمَّ إِنِّي أَعُوذُ بِكَ مِنَ الْخُبُثِ وَالْخَبَائِثِ\n" +
                "\n" +
                "\"Bismillāh. Allāhumma innī a'ūdhu bika minal-khubuthi wa al-khabā'ith.\"" +"\n" +
                "Dengan menyebut nama Allah. Ya Allah, aku berlindung kepada-Mu dari jin perempuan dan laki-laki yang tidak baik.");

        chapterList.add("Doa Belajar");
        List<String> topic6 = new ArrayList<>();
        topic6.add("اللَّهُمَّ افْتَحْ لِي حِكْمَةً وَارْزُقْنِي تَفْهِيمًا وَاجْعَلْنِي مِنَ الصَّالِحِينََ\n" +
                "\n" +
                "\"Allahumma iftah li hikmata, wa rzuqni tafhiman, waj'alni mina s-salihin..\"" +"\n" +
                "Artinya: Ya Allah, bukakanlah untukku hikmah (pengetahuan yang bermanfaat) dan berikanlah aku pemahaman yang baik, dan jadikanlah aku termasuk orang-orang yang shaleh.");

        chapterList.add("Doa Diperlancar Urusan");
        List<String> topic7 = new ArrayList<>();
        topic7.add("اللَّهُمَّ أَصْلِحْ لِي دِينِيَ وَدُنْيَايَ وَآخِرَتِي وَأَجِرْنِي مِنَ النَّارِ\n" +
                "\n" +
                "\"Allahumma ashlih li dinīya wa dunyāya wa ākhiratī, wa ajirnī minan-nār.\"" +"\n" +
                "Artinya: Ya Allah, perbaikilah agamaku, kehidupanku di dunia, dan kehidupanku di akhirat. Selamatkanlah aku dari api neraka.\n");

        chapterList.add("Doa Kedua Orang Tua");
        List<String> topic8 = new ArrayList<>();
        topic8.add("اللَّهُمَّ ارْحَمْهُمَا كَمَا رَبَّيَانِي صَغِيرًا\n" +
                "\n" +
                "\"Allahumma irhamhuma kama rabbayanī ṣaghīrā.\"" +"\n" +
                "Artinya: Ya Allah, sayangilah keduanya sebagaimana mereka menyayangiku ketika aku masih kecil.\n");

        chapterList.add("Doa Niat Berwudhu");
        List<String> topic9 = new ArrayList<>();
        topic9.add("َوَيْتُ الْوُضُوءَ لِرَفْعِ الْحَدَثِ الْأَصْغَرِ فَرْضًا لِلَّهِ تَعَالَى\n" +
                "\n" +
                "\"Nawaitu al-wudhu-a li raf'il hadatsil asghari fardhan lillahi ta'ala.\"" +"\n" +
                "Artinya: Saya niat berwudhu untuk menghilangkan hadas kecil, sebagai kewajiban karena Allah Ta'ala.");


        chapterList.add("Doa Setelah Berwudhu");
        List<String> topic10 = new ArrayList<>();
        topic10.add("أَشْهَدُ أَنْ لَا إِلَٰهَ إِلَّا اللَّهُ وَحْدَهُ لَا شَرِيكَ لَهُ، وَأَشْهَدُ أَنَّ مُحَمَّدًا عَبْدُهُ وَرَسُولُهُ\n" +
                "\n" +
                "\"Ashhadu an lā ilāha illallāh, waḥdahu lā sharīka lah, wa ashhadu anna Muḥammadan ʿabduhu wa rasūluhu..\"" +"\n" +
                "Artinya: Aku bersaksi bahwa tiada sesembahan yang berhak disembah kecuali Allah, Yang Maha Esa, tidak ada sekutu bagi-Nya, dan aku bersaksi bahwa Muhammad adalah hamba-Nya dan Rasul-Nya.");


        chapterList.add("Doa Sebelum Tidur");
        List<String> topic11 = new ArrayList<>();
        topic11.add("بِسْمِكَ اللَّهُمَّ أَحْيَا وَبِسْمِكَ أَمُوتُ\n" +
                "\n" +
                "\"Bismika Allahumma ahyā wa bismika amūt.\"" +"\n" +
                "Artinya: Dengan nama-Mu, ya Allah, aku hidup, dan dengan nama-Mu aku mati.");


        chapterList.add("Doa Bangun Tidur");
        List<String> topic12 = new ArrayList<>();
        topic12.add("الْحَمْدُ لِلَّهِ الَّذِي أَحْيَانَا بَعْدَ مَا أَمَاتَنَا وَإِلَيْهِ النُّشُورُ\n" +
                "\n" +
                "\"Alhamdu lillahi alladhi ahyānā ba'da mā amātanā wa ilayhi n-nushūr..\"" +"\n" +
                "Artinya: Segala puji bagi Allah yang menghidupkan kami setelah kami mati dan kepada-Nya kami akan dibangkitkan.");


        chapterList.add("Doa Keluar WC");
        List<String> topic13 = new ArrayList<>();
        topic13.add("غُفْرَانَكَ الْحَمْدُ لِلَّهِ الَّذِي أَذْهَبَ عَنِّي الْأَذَى وَعَافَانِيَ\n" +
                "\n" +
                "\"Ghufrānaka. Alhamdu lillāh, alladhī adhhaba 'annī al-adhā wa 'āfānī.\"" +"\n" +
                "Artinya: \n" +
                "Dengan memohon ampunan-Mu. Segala puji bagi Allah yang telah menghilangkan kotoran dari tubuhku dan menjaga kesehatanku.\n");


        chapterList.add("Doa Niat Berpuasa");
        List<String> topic14 = new ArrayList<>();
        topic14.add("أَنَا نَوَيْتُ صَوْمَ غَدٍ عَنْ أَدَاءِ فَرْضِ شَهْرِ رَمَضَانَ هَذِهِ السَّنَةِ لِلَّهِ تَعَالَ\n" +
                "\n" +
                "\"Anā nawaitu ṣawma ghadin 'an 'adā'i farḍi shahri Ramaḍāna hadhihi s-sanati lillāhi ta'ālā.\"" +"\n" +
                "Artinya: Saya niat berpuasa esok hari untuk menunaikan kewajiban puasa bulan Ramadhan tahun ini, karena Allah Ta'ala.\n");


        chapterList.add("Doa Berbuka Puasa");
        List<String> topic15 = new ArrayList<>();
        topic15.add("اللَّهُمَّ لَكَ صُمْتُ وَعَلَى رِزْقِكَ أَفْطَرْتَُ\n" +
                "\n" +
                "\"Allāhumma laka ṣumtu wa 'alā rizqika aftartu.\"" +"\n" +
                "Artinya: Ya Allah, karena-Mu aku berpuasa dan dengan rezeki-Mu aku berbuka.");


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
        topicList.put(chapterList.get(12), topic13);
        topicList.put(chapterList.get(13), topic14);
        topicList.put(chapterList.get(14), topic15);

    }


}
