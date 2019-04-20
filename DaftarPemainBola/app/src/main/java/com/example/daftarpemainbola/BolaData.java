package com.example.daftarpemainbola;

import java.util.ArrayList;

public class BolaData {
    public static String[][] data = new String[][]{
            {"Steven Gerrard", "Legenda Liverpool FC", "https://upload.wikimedia.org/wikipedia/commons/a/aa/Steven_Gerrard_in_2014.jpg","Steven George Gerrard (lahir di Whiston, Merseyside, Inggris, 30 Mei 1980; umur 38 tahun) adalah seorang mantan pemain sepak bola asal Inggris. Gerrard telah digambarkan sebagai salah satu gelandang Inggris terbesar dalam sejarah, seorang pemimpin sejati, dan seorang pelari tak kenal lelah dengan visi yang luar biasa."},
            {"Carles Puyol", "Legenda FC Barcelona", "https://upload.wikimedia.org/wikipedia/commons/6/60/Carles_Puyol_Joan_Gamper-Tr.jpg","Carles Puyol adalah mantan pemain Fc Barcelona yang berposisi sebagai pemain belakang. Puyol dikenal sebagai bek tangguh dan legenda Barcelona yang mengawal pertahanan barcelona selama bertahun-tahun. Puyol juga menjabat sebagai kapten Fc Barcelona."},
            {"Alessandro Del Piero", "Legenda Juventus FC", "https://upload.wikimedia.org/wikipedia/commons/b/b7/Alessandro_Del_Piero_2008_cropped.jpg","Alessandro Del Piero adalah mantan pemain Juventus Fc yang berposisi sebagai penyerang. Del piero merupakan legenda dan kapten juventus, membela juventus sejak akademi del piero dikenal sebagai pemain yang loyal kepada juventus. Del piero merupakan bagian dari skuad italia saat menjuarai piala dunia 2006"},
            {"Roberto Carlos", "Legenda Real Madrid CF", "https://upload.wikimedia.org/wikipedia/commons/5/53/Roberto_Carlos_2011.jpg","Roberto Carlos adalah mantan pemain real madrid yang berposisi sebagai bek kiri. Roberto carlos terkenal dengan tendangan kaki kiri nya yang keras dan akurat. Roberto Carlos pernah mencetak gol sensasional saat membela brazil melawan prancis pada tahun 1997. Roberto carlos merupakan legenda bagi real madrid dan brazil."},
            {"David Beckham", "Legenda Manchester United FC", "https://upload.wikimedia.org/wikipedia/commons/7/7b/David_Beckham_Nov_11_2007.jpg","David Beckham adalah mantan pemain Manchester United Fc. David beckham terkenal akan tendangan bebas melengkung 180 derajat dan umpan-umpan nya yang akurat. David Beckham merupakan idola bagi kaum wanita karena ketampanannya, selain itu beckham juga merupakan legenda bagi sepakbola inggris."},
            {"Juninho Pernambucano", "Legenda Olympique Lyon", "https://upload.wikimedia.org/wikipedia/commons/7/73/Juninho_wikipedia.jpg","Juninho Pernambucano merupakan mantan pemain olympique lyon, juninho terkenal akan tendangan bebas dan master free-kick bagi olympique lyon. Juninho membantu olympique lyon menjuarai league one 7 kali berturut-turut dan merupakan legenda bagi sepakbola brazil."},
            {"Philipp Lahm", "Legenda FC Bayern Muenchen", "https://upload.wikimedia.org/wikipedia/commons/e/ee/Philipp_Lahm%2C_Germany_national_football_team_%2804%29.jpg","Philipp Lahm adalah mantan pemain Fc Bayern Muenchen dan Timnas Jerman. Lahm hanya membela 1 klub sepanjang karirnya dan dikenal sebagai bek kanan yang hebat. Lahm merupakan kapten bayern dan timnas jerman saat menjuarai piala dunia 2014."},
            {"Bambang Pamungkas", "Legenda Persija Jakarta", "https://upload.wikimedia.org/wikipedia/commons/f/f7/Bambang_Pamungkas_bedah_buku_Kemsetneg.png","Bambang Pamungkas merupakan pemain sepakbola indonesia yang berposisi sebagai penyerang. Nama panggilannya BP, Bp membantu persija menjuarai liga indonesia tahun 2001 dan merupakan bagian dari skuad tim nasional indonesia di piala asia 2007. "},
            {"Deco", "Legenda FC Porto", "https://upload.wikimedia.org/wikipedia/commons/6/63/Anderson_Lu%C3%ADs_de_Souza.jpg","Deco merupakan legenda sepakbola portugal. Deco berposisi sebagai gelandang dan menjadi andalan lini tengah fc porto, barcelona dan chelsea. Deco adalah salah satu sahabat karib cristiano ronaldo di timnas portugal dan menjadi bagian dari skuad portugal di piala dunia 2006 dan 2010. "},
            {"Diego Forlan", "Legenda Atletico de Madrid", "https://upload.wikimedia.org/wikipedia/commons/1/1a/Diego_Forl%C3%A1n_cropped.jpg","Diego Forlan merupakan legenda sepakbola uruguay dan atletico madrid. Diego Forlan terkenal akan nalurinya sebagai striker dan kerap mencetak gol penting untuk negara dan clubnya. Forlan menjadi kapten bagi altetico dan timnas uruguay di piala dunia 2010 dan 2014. "}
    };

    public static ArrayList<Bola> getListData(){
        Bola bola = null;
        ArrayList<Bola> list = new ArrayList<>();
        for (String[] aData : data) {
            bola = new Bola();
            bola.setName(aData[0]);
            bola.setRemarks(aData[1]);
            bola.setPhoto(aData[2]);
            bola.setDescription(aData[3]);

            list.add(bola);
        }

        return list;
    }
}
