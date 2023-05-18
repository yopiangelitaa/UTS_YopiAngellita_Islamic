package com.example.islamic;

import android.os.Bundle;
import android.widget.ExpandableListView;

import androidx.appcompat.app.AppCompatActivity;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class bcsholat extends AppCompatActivity{


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

        chapterList.add("Membaca Niat");
        List<String> topic1 = new ArrayList<>();
        topic1.add("\nNiat yang di baca tergantung pada sholat apa yang akan dikerjakan\n");

        chapterList.add("Takbiratul Ihram");
        List<String> topic2 = new ArrayList<>();
        topic2.add("\n Bacaan latin: Allahu Akbar\n" +
                "\n" +
                "\"Artinya: Allah Maha Besar,\"\n" );

        chapterList.add("Bacaan Doa Iftitah");
        List<String> topic3 = new ArrayList<>();
        topic3.add("اَللهُ اَكْبَرُ كَبِيْرًا وَالْحَمْدُ لِلّهِ كَثِيْرًا وَسُبْحَانَ اللهِ بُكْرَةً وَاَصِيْلًا. اِنِّى وَجَّهْتُ وَجْهِيَ لِلَّذِيْ فَطَرَالسَّمَاوَاتِ وَالْاَرْضَ حَنِيْفًا مُسْلِمًا وَمَا اَنَا مِنَ الْمُشْرِكِيْنَ. اِنَّ صَلَاتِيْ وَنُسُكِيْ وَمَحْيَايَ وَمَمَاتِيْ لِلّهِ رَبِّ الْعَا لَمِيْنَ. لاَ شَرِيْكَ لَهُ وَبِذَلِكَ اُمِرْتُ وَاَنَا مِنَ الْمُسْلِمِيْنَ\n" +
                "\n" +
                "\"Allahu akbar kabiiraa wal hamdu lillahi katsiiraa washub-haanallahi bukratan wa ashiilaa. Inni wajjahtu wajhiya lilladzii fatharassa maawaati wal ardla haniifan musliman wamaa anaa minal musyrikiina. Inna shalaatii wanusukii wamahyaaya wama maati lillahi rabbil aalamiina. Laasyriika lahu wabidzaalika umirtu wa anaa minal muslimin.\"" +"\n" +
                "Artinya: \n" +
                "Allah Maha Besar lagi sempurna Kebesaran-Nya, segala pugi bagi-Nya dan Maha Suci Allah sepanjang pagi dan sore. Kuhadapkan muka hatiku kepada Dzat yang menciptakan langit dan bumi dengan keadaan lurus dan menyerahkan diri dan aku bukanlah dari golongan kaum musyrikin. Sesungguhnya shalatku ibadatku, hidupku dan matiku semata hanya untuk Allah seru sekalian alam. Tidak ada sekutu bagi-Nya dan dengan aku diperintahkan untuk tidak menyekutukan bagi-Nya. Dan aku dari gologan orang muslimin.\n");

        chapterList.add("Membaca Surat Al-Fatihah");
        List<String> topic4 = new ArrayList<>();
        topic4.add("بِسْمِ اللّهِ الرَّحْمَنِ الرَّحِيْمِ . الْحَمْدُ لِلَّهِ رَبِّ الْعَالَمِينَ . الرَّحْمَٰنِ الرَّحِيم . مَالِكِ يَوْمِ الدِّينِ . إِيَّاكَ نَعْبُدُ وَإِيَّاكَ نَسْتَعِينُ . اهْدِنَا الصِّرَاطَ الْمُسْتَقِيمَ . صِرَاطَ الَّذِينَ أَنْعَمْتَ عَلَيْهِمْ غَيْرِ الْمَغْضُوبِ عَلَيْهِمْ وَلَا الضَّالِّينَ\n" +
                "\n" +
                "\"Bismillahirrahmaanirrahiim. Alhamdu lillahi rabbil 'aalamiin. Arrahmaanirrahiim. Maaliki yaumiddiin. Iyyaaka na'budu waiyyaaka nasta'iin. Ihdinash shirraathal musthaqiim. Shiraathal ladziina an'amta 'alaihim. Ghairil maghduubi 'alaihim waladl-dlaalliin..\n\"" +"\n" +
                "Artinya: \n" +
                "Dengan nama Allah yang maha pengasih dan penyayang. Segala puji bagi Allah, Tuhan seru sekalian alam. Yang maha pengasih dan penyayang. Yang menguasai hari kemudian. Pada-Mu lah aku mengabdi dan kepada-Mu lah aku meminta pertologan. Tunjukilah kami ke jalan yang lurus. Bagaikan jalannya orang-orang yang telah Engkau beri ni'mat. Bukan jalan mereka yang pernah Engkau murkai, atau jalannya orang-orang yang sesat.");


        chapterList.add("Membaca Surat-surat Pendek");
        List<String> topic5 = new ArrayList<>();
        topic5.add("diperbolehkan membaca surat pendek apa saja yang telah dikuasai\n");

        chapterList.add("Bacaan Ruku'");
        List<String> topic6 = new ArrayList<>();
        topic6.add("سُبْحَانَ رَبِّىَ الْعَظِيمِ وَبِحَمْدِهِِ\n" +
                "\n" +
                "\" Subhaana rabbiyal 'adzhiimi wabihamdihi (3 kali).\"" +"\n" +
                "Artinya: Maha suci Tuhan Maha Agung serta memujilah aku kepada-Nya.\n");

        chapterList.add("Bacaan I'tidal");
        List<String> topic7 = new ArrayList<>();
        topic7.add("سَمِعَ اللَّهُ لِمَنْ حَمِدَهُِِ\n" +
                "\n" +
                "\"  Sami'allaahu liman hamidah.\"" +"\n" +
                "Artinya: Allah mendengar orang yang memuji-Nya.\n");

        chapterList.add("Pada waktu berdiri tegak (i'tidal) terus membaca:");
        List<String> topic8 = new ArrayList<>();
        topic8.add("رَبَّنَا لَكَ الْحَمْدُ مِلْءَ السَّمَوَاتِ وَالأَرْضِ وَمِلْءَ مَا شِئْتَ مِنْ شَىْءٍ بَعْدُِِ\n" +
                "\n" +
                "\" Rabbanaa lakal hamdu mil ussamawaati wamil ul ardli wamil u maa syi'ta min syai'in ba'du.\"" +"\n" +
                "Artinya: Ya Allah Tuhan kami, bagi Mu segala puji, sepenuh langit dan bumi, dan sepenuh barang yang Kau kehendaki sesudah itu.\n");



        chapterList.add("Bacaan Sujud");
        List<String> topic9 = new ArrayList<>();
        topic9.add("سُبْحَانَ رَبِّىَ الْأَعْلَى وَبِحَمْدِهُِ\n" +
                "\n" +
                "\"Subhaana rabbiyal a'laa wabihamdihi (3 kali).\"" +"\n" +
                "Artinya: Maha Suci Tuhan, serta memujilah aku kepada-Nya.");


        chapterList.add("Duduk di Antara Dua Sujud");
        List<String> topic10 = new ArrayList<>();
        topic10.add("رب اغْفِرلي وَارْحَمْنِى واجبرني وَارْفَعْنِي وَارْزُقْنِى وَاهْدِنِى وَعَافِنِى وَاعْفُ عَنِّى\n" +
                "\n" +
                "\" Robbighfirlii warhamnii wajburnii warfa'nii warzuqnii wahdinii wa'aafinii wa'fuannii.\"" +"\n" +
                "Artinya:Ya Allah, ampunilah dosaku, belas kasihanilah aku, cukupkanlah segala kekurangan dan angkatlah derajatku, berilah rizki kepadaku dan berilah aku petunjuk dan berilah kesehatan kepadaku dan berilah ampunan kepadaku");


        chapterList.add("Sujud Kedua");
        List<String> topic11 = new ArrayList<>();
        topic11.add("سُبْحَانَ رَبِّىَ الْأَعْلَى وَبِحَمْدِهِ\n" +
                "\n" +
                "\"Subhaana rabbiyal a'laa wabihamdihi (3 kali)\"" +"\n" +
                "Artinya: Maha Suci Tuhan, serta memujilah aku kepada-Nya.");

        chapterList.add("Bangkit untuk Rakaat Berikutnya");
        List<String> topic12 = new ArrayList<>();
        topic12.add("التَّحِيَّاتُ الْمُبَارَكَاتُ الصَّلَوَاتُ الطَّيِّبَاتُ لِلَّهِ السَّلاَمُ عَلَيْكَ أَيُّهَا النَّبِىُّ وَرَحْمَةُ اللَّهِ وَبَرَكَاتُهُ السَّلاَمُ عَلَيْنَا وَعَلَى عِبَادِ اللَّهِ الصَّالِحِينَ أَشْهَدُ أَنْ لاَ إِلَهَ إِلاَّ اللَّهُ وَأَشْهَدُ أَنَّ مُحَمَّدًا رَسُولُ اللَّهِاَ . للَّهُمَّ صَلِّ عَلىَسَـيَّدِنَا مُحَمَّدٍِ\n" +
                "\n" +
                "\"Attahiyyaatul mubaarakaatush sholawaatuth thayyibaatu lillaah. Assalaamu 'alaika ayyuhan nabiyyu wa rahmatullahi wabarakaatuh. Assalaaamu'alainaa wa 'alaa 'ibaadillaahish shaalihiin. Asyhadu allaa ilaaha illallah wa asyhadu anna Muhammadar rasuulullah. Allahumma shalli 'alaa sayyidinaa Muhammad.\"" +"\n" +
                "Artinya: Segala kehormatan, keberkahan, kebahagiaan dan kebaikan bagi Allah. Salam, rahmat dan berkah-Nya kupanjatkan kepadamu wahai Nabi (Muhammad). Salam (keselamatan) semoga tetap untuk kami seluruh hamba yang shaleh-shaleh. Aku bersaksi bahwa tiada Tuhan melainkan Allah. Dan aku bersaksi bahwa Nabi Muhammad Adalah utusan Allah. Ya Allah! Limpahilah rahmat kapada Nabi Muhammad.");

        chapterList.add("Duduk Tasyahud/Tahiyat Awal");
        List<String> topic13 = new ArrayList<>();
        topic13.add("التَّحِيَّاتُ الْمُبَارَكَاتُ الصَّلَوَاتُ الطَّيِّبَاتُ لِلَّهِ السَّلاَمُ عَلَيْكَ أَيُّهَا النَّبِىُّ وَرَحْمَةُ اللَّهِ وَبَرَكَاتُهُ السَّلاَمُ عَلَيْنَا وَعَلَى عِبَادِ اللَّهِ الصَّالِحِينَ أَشْهَدُ أَنْ لاَ إِلَهَ إِلاَّ اللَّهُ وَأَشْهَدُ أَنَّ مُحَمَّدًا رَسُولُ اللَّهِاَ . للَّهُمَّ صَلِّ عَلىَسَـيَّدِنَا مُحَمَّدٍ\n" +
                "\n" +
                "\" Attahiyyaatul mubaarakaatush sholawaatuth thayyibaatu lillaah. Assalaamu 'alaika ayyuhan nabiyyu wa rahmatullahi wabarakaatuh. Assalaaamu'alainaa wa 'alaa 'ibaadillaahish shaalihiin. Asyhadu allaa ilaaha illallah wa asyhadu anna Muhammadar rasuulullah. Allahumma shalli 'alaa sayyidinaa Muhammad..\"" +"\n" +
                "Artinya: Segala kehormatan, keberkahan, kebahagiaan dan kebaikan bagi Allah. Salam, rahmat dan berkah-Nya kupanjatkan kepadamu wahai Nabi (Muhammad). Salam (keselamatan) semoga tetap untuk kami seluruh hamba yang shaleh-shaleh. Aku bersaksi bahwa tiada Tuhan melainkan Allah. Dan aku bersaksi bahwa Nabi Muhammad Adalah utusan Allah. Ya Allah! Limpahilah rahmat kapada Nabi Muhammad.");


        chapterList.add("Bacaan Tasyahud/Tahiyat Akhir");
        List<String> topic14 = new ArrayList<>();
        topic14.add("لتَّحِيَّاتُ الْمُبَارَكَاتُ الصَّلَوَاتُ الطَّيِّبَاتُ لِلَّهِ السَّلاَمُ عَلَيْكَ أَيُّهَا النَّبِىُّ وَرَحْمَةُ اللَّهِ وَبَرَكَاتُهُ السَّلاَمُ عَلَيْنَا وَعَلَى عِبَادِ اللَّهِ الصَّالِحِينَ أَشْهَدُ أَنْ لاَ إِلَهَ إِلاَّ اللَّهُ وَأَشْهَدُ أَنَّ\n" +
                "وَعَلَى آلِ سَيِّدِنَامُحَمَّدٍمُحَمَّدًا رَسُولُ اللَّهِاَ . للَّهُمَّ صَلِّ عَلىَسَـيَّدِنَا مُحَمَّدٍ\n" +
                "كَمَا صَلَّيْتَ عَلَى سَيِّدِنَا إِبْرَاهِيْمِ وَعَلَى اَلِ سَيِّدِنَا إِبْرَاهِيْمِ. وَبَارِكْ عَلَى سَيِّدِنَا مُحَمَّدٍ وَعَلَى اَلِ سَيِّدِنَا مُحَمَّدٍ كََمَا بَارَكْتَ عَلَى سَيِّدِنَا إِبْرَاهِيْمِ وَعَلَى اَلِ سَيِّدِنَا إِبْرَاهِيْمِ فِى الْعَالَمِيْنَ إِنَّكَ حَمِيْدٌ مَجِيْدٌ.\n" +
                "\n" +
                "\" Attahiyyaatul mubaarakaatush sholawaatuth thayyibaatu lillaah. Assalaamu 'alaika ayyuhan nabiyyu wa rahmatullahi wabarakaatuh. Assalaaamu'alainaa wa 'alaa 'ibaadillaahish shaalihiin. Asyhadu allaa ilaaha illallah wa asyhadu anna Muhammadar rasuulullah. Allahumma shalli 'alaa sayyidinaa Muhammad. Kamaa shallaita 'alaa sayyidina Ibraahima wa 'alaa aali sayiidinaa Ibraahimm wabaarik 'alaa sayyidina Muhammad wa'alaa aali sayyidina muhammad. Kamaa baarakta 'alaa sayyidinaa Ibraahim fil'aala miina innaka hamiidun majiid.\"" +"\n" +
                "Artinya: Segala kehormatan, keberkahan, kebahagiaan dan kebaikan bagi Allah. Salam, rahmat dan berkah-Nya kupanjatkan kepadamu wahai Nabi (Muhammad). Salam (keselamatan) semoga tetap untuk kami seluruh hamba yang shaleh-shaleh. Aku bersaksi bahwa tiada Tuhan melainkan Allah. Dan aku bersaksi bahwa Nabi Muhammad Adalah utusan Allah. Ya Allah! Limpahilah rahmat kapada Nabi Muhammad. Sebagimana pernah Engkau beri rahmat kepada Nabi Ibrahim dan keluarganya. Dan limpahilah berkah atas Nabi Muhammad beserta para keluarganya. Sebagaimana Engkau memberi berkah kepada Nabi Ibrahim dan keluarganya. Di seluruh alam semesta Engkaulah yang terpuji dan Maha mulia.");


        chapterList.add(" Salam");
        List<String> topic15 = new ArrayList<>();
        topic15.add("السَّلاَمُ عَلَيْكُمْ وَرَحْمَةُ اللهِ\n" +
                "\n" +
                "\"Assalaamu alaikum wa rahmatullah\"" +"\n" +
                "Artinya: Keselamatan dan rahmat Allah semoga tetap pada kamu sekalian");

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