package com.example.tuntunan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import androidx.appcompat.widget.Toolbar

class Page7 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page7)

        // Set up the toolbar
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Doa Setelah Sholat"

        // Section: Dzikir Pertama
        val pertamaTitle = findViewById<TextView>(R.id.pertamaTitle)
        val pertamaContent = findViewById<TextView>(R.id.pertamaContent)
        pertamaTitle.setOnClickListener {
            toggleVisibility(pertamaContent)
        }
        val pertamaText = """
            أَسْتَغْفِرُ اللهَ (٣×)
             اللَّهُمَّ أَنْتَ السَّلامُ، وَمِنْكَ السَّلَامُ، تَبَارَكْتَ يَا ذَا الْجَلَالِ وَالْإِكْرَامِ

            Astaghfirullah (3x) 
            Allahumma anta assalaam, wa minka assalaam, tabaarakta yaa dzal jalaali wal ikraam

            Artinya: 
            Aku memohon ampun kepada Allah, (3x). 
            Ya Allah, Engkau Mahasejahtera, dan dari-Mu kesejahteraan, Mahasuci Engkau, wahai Rabb Pemilik keagungan dan kemuliaan.
            (Dari Tsauban, HR Muslim, Ahmad, Abu Dawud, an-Nasa'i & Ibnu Majah)
        """.trimIndent()
        pertamaContent.text = pertamaText

        // Section: Dzikir kedua
        val keduaTitle = findViewById<TextView>(R.id.keduaTitle)
        val keduaContent = findViewById<TextView>(R.id.keduaContent)
        keduaTitle.setOnClickListener {
            toggleVisibility(keduaContent)
        }
        val keduaText = """
            لا إِلَهَ إِلَّا اللهُ وَحْدَهُ لَا شَرِيكَ لَهُ ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيرُ، اللَّهُمَّ لَا مَانِعَ لِمَا أَعْطَيْتَ، وَلَا مُعْطِيَ لِمَا مَنَعْت، وَلَا يَنْفَعُ ذَا الْجَدِ مِنْكَ الْجَدُّ
            
            Laa ilaaha illa Allahu wahdahu laa syariika lahu, lahul mulku wa lahul hamdu wa huwa 'ala kulli syai'in qadiir, Allahumma laa maani'a limaa a'thaita wa laa mu'thiya limaa mana'ta wa laa dzal jaddi minka aljaddu
            
            Artinya:
            Tidak ada ilah yang berhak diibadahi dengan benar melainkan hanya Allah Yang Mahaesa, tidak ada sekutu bagi-Nya. Bagi-Nya segala ke- rajaan dan bagi-Nya segala pujian. Dia Mahakuasa atas segala sesuatu. Ya Allah, tidak ada yang men- cegah apa yang Engkau beri dan tidak ada yang memberi apa yang Engkau cegah. Tidak berguna kekayaan dan kemuliaan itu bagi pemiliknya dari (siksa)-Mu.
            (Dari al-Mughirah bin Syu'bah, HR Bukhari, Muslim, Abu Dawud, Ahmad, an-Nasa'i, Ibnu Khuzaimah, & ad-Darimi)
        """.trimIndent()
        keduaContent.text = keduaText

        // Section: Dzikir ketiga
        val ketigaTitle = findViewById<TextView>(R.id.ketigaTitle)
        val ketigaContent = findViewById<TextView>(R.id.ketigaContent)
        ketigaTitle.setOnClickListener {
            toggleVisibility(ketigaContent)
        }
        val ketigaText = """
            سُبْحَانَ اللهِ (۳۳×) اَلْحَمْدُ لِلَّهِ (۳۳×) اللهُ أَكْبَرُ (۳۳×)
            
            Subhaanallah (33x)
            Alhamdulillah (33x)
            Allahu akbar (33x)
            
            Artinya:
            Mahasuci Allah, (33x)
            Segala puji bagi Allah, (33x)
            Allah Mahabesar, (33x)"
        """.trimIndent()
        ketigaContent.text = ketigaText

        // Section: Dzikir keempat
        val keempatTitle = findViewById<TextView>(R.id.keempatTitle)
        val keempatContent = findViewById<TextView>(R.id.keempatContent)
        keempatTitle.setOnClickListener {
            toggleVisibility(keempatContent)
        }
        val keempatText = """
            لا إِلَهَ إِلَّا اللَّهُ وَحْدَهُ لَا شَرِيكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِير

            Laa ilaaha illa Allahu wahdahu laa syariika lahu lahul mulku wa lahul hamdu wa huwa 'ala kulli syai'in qadiir
            
            Artinya:
            Tidak ada tuhan yang berhak diibadahi dengan benar melainkan hanya Allah Yang Maha Esa, tidak ada sekutu bagi-Nya, bagi kerajaan, bagi-Nya segala puji. Dialah Yang Mahakuasa atas segala sesuatu.
            (HR Muslim, Ahmad, Ibnu Khuzaimah & Baihaqi)
        """.trimIndent()
        keempatContent.text = keempatText

        // Section: pendek
        val pendekTitle = findViewById<TextView>(R.id.pendekTitle)
        val pendekContent = findViewById<TextView>(R.id.pendekContent)
        pendekTitle.setOnClickListener {
            toggleVisibility(pendekContent)
        }
        val pendekText = """
            Membaca surah Al Ikhlas terlebih dahulu,

            قُلْ هُوَ اللّٰهُ اَحَدٌۚ
            
            Qul huwallāhu aḥad
            
            Artinya:
            Katakanlah (Muhammad), "Dialah Allah, Yang Maha Esa."
            
            اَللّٰهُ الصَّمَدُۚ
            
            Allāhuṣ-ṣamad
            
            Artinya:
            Allah tempat meminta segala sesuatu.
            
            لَمْ يَلِدْ وَلَمْ يُوْلَدْۙ
            
            Lam yalid wa lam yụlad
            
            Artinya:
            (Allah) tidak beranak dan tidak pula diperanakkan.
            
            وَلَمْ يَكُنْ لَّهٗ كُفُوًا اَحَدٌ
            
            Wa lam yakul lahụ kufuwan aḥad
            
            Artinya:
            Dan tidak ada sesuatu yang setara dengan Dia.
            
            
            Kemudian dilanjutkan dengan surah Al Falaq
            
            قُلْ اَعُوْذُ بِرَبِّ الْفَلَق
            
            qul a'ụżu birabbil-falaq
            
            Artinya:
            Katakanlah (Nabi Muhammad), "Aku berlindung kepada Tuhan yang (menjaga) fajar (subuh)
            
            مِنْ شَرِّ مَا خَلَق
            
            min syarri mā khalaq
            
            Artinya:
            dari kejahatan (makhluk yang) Dia ciptakan
            
            وَمِنْ شَرِّ غَاسِقٍ اِذَا وَقَ
            
            wa min syarri gāsiqin iżā waqab
            
            Artinya:
            dari kejahatan malam apabila telah gelap gulita
            
            وَمِنْ شَرِّ النَّفّٰثٰتِ فِى الْعُقَدِۙ
            
            wa min syarrin-naffāsāti fil-'uqad
            
            Artinya:
            dari kejahatan perempuan-perempuan (penyihir) yang meniup pada buhul-buhul (talinya)
            
            وَمِنْ شَرِّ حَاسِدٍ اِذَا حَسَدَࣖ
            
            wa min syarri hāsidin iżā hasad.
            
            Artinya:
            dan dari kejahatan orang yang dengki apabila dia dengki.
            
            
            Lalu, membaca surat An Nas,
            
            قُلْ اَعُوْذُ بِرَبِّ النَّاس
            
            qul a'ụżu birabbin-nās
            
            Artinya:
            Katakanlah (Nabi Muhammad), "Aku berlindung kepada Tuhan manusia."
            
            مَلِكِ النَّاسِۙ
            
            malikin-nās
            
            Artinya:
            Raja manusia,
            
            اِلٰهِ النَّاسِۙ
            
            ilāhin-nās
            
            Artinya:sembahan manusia
            
            مِنْ شَرِّ الْوَسْوَاسِ ەۙ الْخَنَّاسِۖ
            
            min syarril-waswāsil-khannās
            
            Artinya:
            dari kejahatan (setan) pembisik yang bersembunyi
            
            الَّذِيْ يُوَسْوِسُ فِيْ صُدُوْرِ النَّاسِۙ
            
            allażī yuwaswisu fī ṣudụrin-nās
            
            Artinya:
            yang membisikkan (kejahatan) ke dalam dada manusia,
            
            مِنَ الْجِنَّةِ وَالنَّاسِ
            
            minal-jinnati wan-nās
            
            Artinya: 
            dari (golongan) jin dan manusia.
        """.trimIndent()
        pendekContent.text = pendekText

        // Section: kursi
        val kursiTitle = findViewById<TextView>(R.id.kursiTitle)
        val kursiContent = findViewById<TextView>(R.id.kursiContent)
        kursiTitle.setOnClickListener {
            toggleVisibility(kursiContent)
        }
        val kursiText = """      
            اَللّٰهُ لَآ اِلٰهَ اِلَّا هُوَۚ اَلْحَيُّ الْقَيُّوْمُ ەۚ لَا تَأْخُذُهٗ سِنَةٌ وَّلَا نَوْمٌۗ لَهٗ مَا فِى السَّمٰوٰتِ وَمَا فِى الْاَرْضِۗ مَنْ ذَا الَّذِيْ يَشْفَعُ عِنْدَهٗٓ اِلَّا بِاِذْنِهٖۗ يَعْلَمُ مَا بَيْنَ اَيْدِيْهِمْ وَمَا خَلْفَهُمْۚ وَلَا يُحِيْطُوْنَ بِشَيْءٍ مِّنْ عِلْمِهٖٓ اِلَّا بِمَا شَاۤءَۚ وَسِعَ كُرْسِيُّهُ السَّمٰوٰتِ وَالْاَرْضَۚ وَلَا يَـُٔوْدُهٗ حِفْظُهُمَاۚ وَهُوَ الْعَلِيُّ الْعَظِيْمُ
            
            Allāhu lā ilāha illā huw, al-ḥayyul-qayyụm, lā ta`khużuhụ sinatuw wa lā na`ụm, lahụ mā fis-samāwāti wa mā fil-arḍ, man żallażī yasyfa'u 'indahū illā bi`iżnih, ya'lamu mā baina aidīhim wa mā khalfahum, wa lā yuḥīṭụna bisyai`im min 'ilmihī illā bimā syā`, wasi'a kursiyyuhus-samāwāti wal-arḍ, wa lā ya`ụduhụ ḥifẓuhumā, wa huwal-'aliyyul-'aẓīm
            
            Artinya:
            Allah, tidak ada tuhan selain Dia, Yang Maha Hidup lagi terus-menerus mengurus (makhluk-Nya). Dia tidak dilanda oleh kantuk dan tidak (pula) oleh tidur. Milik-Nyalah apa yang ada di langit dan apa yang ada di bumi. Tidak ada yang dapat memberi syafaat di sisi-Nya tanpa izin-Nya. Dia mengetahui apa yang ada di hadapan mereka dan apa yang ada di belakang mereka. Mereka tidak mengetahui sesuatu apa pun dari ilmu-Nya, kecuali apa yang Dia kehendaki. Kursi-Nya (ilmu dan kekuasaan-Nya) meliputi langit dan bumi. Dia tidak merasa berat memelihara keduanya. Dialah yang Maha Tinggi lagi Maha Agung.
        """.trimIndent()
        kursiContent.text = kursiText

        // Section: selamat
        val selamatTitle = findViewById<TextView>(R.id.selamatTitle)
        val selamatContent = findViewById<TextView>(R.id.selamatContent)
        selamatTitle.setOnClickListener {
            toggleVisibility(selamatContent)
        }
        val selamatText = """      
            اَللهُمَّ اِنَّا نَسْئَلُكَ سَلاَمَةً فِى الدِّيْنِ وَعَافِيَةً فِى الْجَسَدِ وَزِيَادَةً فِى الْعِلْمِ وَبَرَكَةً فِى الرِّزْقِ وَتَوْبَةً قَبْلَ الْمَوْتِ وَرَحْمَةً عِنْدَ الْمَوْتِ وَمَغْفِرَةً بَعْدَ الْمَوْتِ. اَللهُمَّ هَوِّنْ عَلَيْنَا فِىْ سَكَرَاتِ الْمَوْتِ وَالنَّجَاةَ مِنَ النَّارِ وَالْعَفْوَ عِنْدَ الْحِسَابِ .رَبَّنَا لَا تُزِغْ قُلُوْبَنَا بَعْدَ إِذْ هَدَيْتَنَا وَهَبْ لَنَا مِنْ لَدُنْكَ رَحْمَةً إِنَّكَ أَنْتَ الْوَهَّابُ. رَبَّنَا آتِنَا فِي الدُّنْيَا حَسَنَةً وَفِي الْآخِرَةِ حَسَنَةً وَقِنَا عَذَابَ النَّارِ
            
            Allaahumma innaa nas aluka salaamatan fiddiini wa 'aafiyatan fil jasadi waziaadatan fil'ilmi wabarakatan firrizqi wataubatan qablal maut warahmatan 'indal maut wamaghfiratan ba'dal maut allahumma hawwin 'alainaa fii sakaraatil maut wa najjata minanaari wal 'afwa indal hisaab rabbanaa laatuzig quluubanaa ba'da idz hadaitanaa wahablanaa min ladunka rahmatan innaka antal wahhaab rabbana aatinaa fiddunya hasanatan wafil aakhirati hasanatan waqinaa 'adzaabannaar.
            
            Artinya:
            Ya Allah kami mohon pada-Mu keselamatan dalam agama, kesehatan tubuh, tambahan pada ilmu, keberkatan pada rezeki, penerimaan tobat sebelum maut, kasih sayang ketika maut, dan keampunan setelah maut. Ya Allah permudahkanlah kami dalam menghadapi sakarataul maut dan kelepasan dari neraka, dan kemaafan ketika hisab. Ya Allah jangan ragukan hati kami setelah Engkau beri petunjuk dan berilah kepada kami dari-Mu kasih sayang, sesungguhnya Engkau Maha Pemberi. Ya Tuhan kami, berilah kami kebaikan di dunia dan di akhirat dan peliharalah kami dari siksa neraka.
        """.trimIndent()
        selamatContent.text = selamatText
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }

    private fun toggleVisibility(view: View) {
        view.visibility = if (view.visibility == View.VISIBLE) View.GONE else View.VISIBLE
    }
}