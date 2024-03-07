package com.iksan.marvelcinemaaticuniverse.db

import com.iksan.marvelcinemaaticuniverse.R
import com.iksan.marvelcinemaaticuniverse.model.Marvel

object MarvelData {
    private val database = arrayOf(
        arrayOf(
            "The Avenger",
            "R 13+ | Super hero | Action ",
            "Sutradara : Anthony Russo",
            "Durasi : 2 Jam 23 Menit",
            "Kqetika musuh yang tak terduga muncul, mengancam keselamatan dan keamanan dunia, Nick Fury, direktur Badan Perdamaian Internasional, dikenal sebagai S.H.I.E.L.D. , membutuhkan tim untuk menyelamatkan dunia dari bencana. Usaha perekrutan pun dimulai Iron Man, Captain America, Hulk, Thor, Black Widow dan Hawkeye dikumpulkan untuk menaklukkan Dewa Kehancuran, Loki, dalam usahanya menghancurkan bumi.",
            R.drawable.the_avenger,
            R.drawable.bg_theavenger,
            "https://www.marvel.com/movies/the-avengers"
        ),
        arrayOf(
            "Captain America",
            "R 13+ | Super hero | Action ",
            "Sutradara : Anthony Russo",
            "Durasi : 2 jam 28 Menit",
            "Steve Rogers, ditolak masuk militer karena tidak layak. Kecewa, ia kemudian menjadi relawan untuk sebuah program rahasia, yang membuatnya menjelma menjadi seorang prajurit luar biasa, Captain America.",
            R.drawable.captainamerica,
            R.drawable.bg_captainamerica,
            "https://www.marvel.com/movies/captain-america-the-winter-soldier"
        ),
        arrayOf(
            "Dr. Strange",
            "R 13+ | Super hero | Action ",
            "Sutradara : Sam Raimi",
            "Durasi : 2 jam 6 Menit",
            "Dr. Stephen Strange mengalami sebuah kecelakaan yang fatal yang merusak kemampuan motorik kedua tangannya. Demi kesembuhannya, ia mengunjungi seorang penyihir misterius bernama Ancient One di Tibet",
            R.drawable.dr_strange,
            R.drawable.bg_drstrange,
            "https://www.marvel.com/movies/doctor-strange-in-the-multiverse-of-madness"
        ),
        arrayOf(
            "Spiderman No Way Home",
            "R 13+ | Super hero | Action ",
            "Sutradara : Jon Watts",
            "Durasi : 2 jam 28 Menit",
            "Pertama kalinya dalam sejarah layar lebar Spider-Man, identitas asli dari pahlawan nan ramah ini terbongkar, sehingga membuat tanggung jawabnya sebagai seorang berkekuatan super berbenturan dengan kehidupan normalnya, dan menempatkan semua orang terdekatnya dalam posisi paling terancam.",
            R.drawable.spiderman_nowayhome,
            R.drawable.bg_spidermannowayhome,
            "https://www.marvel.com/movies/spider-man-no-way-home"
        ),
        arrayOf(
            "Ant-Man",
            "R 13+ | Super hero | Action ",
            "Sutradara : Shane Black",
            "Durasi : 1 jam 58 Menit",
            "Scott Lang (Paul Rudd), Hope Van Dyne (Evangeline Lilly) Dr. Hank Pym (Michael Douglas) dan Janet Van Dyne (Michelle Pfeiffer) menjelajahi Alam Kuantum, tempat mereka bertemu dengan makhluk aneh dan memulai petualangan yang melampaui batas yang mereka pikir mungkin.",
            R.drawable.antman,
            R.drawable.bg_antman,
            "https://www.marvel.com/movies/ant-man"
        ),
        arrayOf(
            "Black Panther",
            "R 13+ | Super hero | Action ",
            "Sutradara : Ryan Coogler",
            "Durasi : 2 jam 15 Menit",
            "Sebagai Raja baru dari Wakanda, T’Challa (Chadwick Boseman) masih bergumul mengenai perasaannya atas meninggalnya sang ayah, T’Chaka (John Kani). Namun ia kemudian memutuskan untuk meneruskan perjuangan sang ayah. Ketika Wakanda berada dalam ancaman dua musuh berbahaya yang dapat mengancam keselamatan negara, Black Panther berusaha membuktikan diri sebagai raja sejati Wakanda. Ia harus menggunakan kostum barunya serta kekuatannya untuk membela Wakanda dan negara lainnya.",
            R.drawable.blackpanther,
            R.drawable.bg_blackpanther,
            "https://www.marvel.com/movies/black-panther"
        ),
        arrayOf(
            "Thor Ragnarok",
            "R 13+ | Super hero | Action ",
            "Sutradara : Taika Waititi ",
            "Durasi : 2 Jam 25 Menit",
            "Dipenjara, Thor yang hebat menemukan dirinya dalam sebuah kontes gladiator yang mematikan melawan Hulk, mantan sekutunya. Thor harus berjuang untuk bertahan hidup dan berpacu melawan waktu untuk mencegah Hela yang sangat kuat menghancurkan rumah dan peradaban Asgardian.",
            R.drawable.thor,
            R.drawable.bg_thorragnarok,
            "https://www.marvel.com/movies/thor-ragnarok"
        ),
        arrayOf(
            "The Incredible Hulk",
            "R 13+ | Super hero | Action ",
            "Sutradara : Ang Lee",
            "Durasi : 2 Jam 18 Menit",
            "Doktor Bruce Banner tak sengaja terpapar radiasi gamma dan memiliki efek samping sangat unik. Setiap amarahnya memuncak, Bruce berubah menjadi sesosok monster hijau rakasa yang siap mengamuk.",
            R.drawable.hulk,
            R.drawable.bg_hulk,
            "https://www.marvel.com/movies/the-incredible-hulk"
        ),
        arrayOf(
            "Ther Guardian Of Galaksi ",
            "R 13+ | Super hero | Action ",
            "Sutradara : James Gunn",
            "Durasi : 2 Jam 2 Menit",
            "Peter lolos dari planet Morag membawa sebuah bola berharga yang sangat diinginkan oleh musuhnya, Ronan. Untuk menghentikannya, Peter pun membentuk tim superhero berjulukan Guardians of The Galaxy.",
            R.drawable.the_guardian_ofgalaksi,
            R.drawable.bg_the_guardian,
            "https://genshin.mihoyo.com/en/character/mondstadt?char=15"
        ),
        arrayOf(
            "Spider-Man Far from Home",
            "R 13+ | Super hero | Action ",
            "Sutradara : Jon Watts ",
            "Durasi : 2 Jam 9 Menit",
            "Peter Parker (Tom Holland) tengah mengunjungi Eropa untuk liburan panjang bersama temaan-temanya. Sayangnya , Parker tidak bisa dengan tenang menikmati liburannya, karena Nick Fury datang secara tiba-tiba di kamar hotelnya. Selama di Eropa pun Peter harus menghadapi banyak musuh mulai dari Hydro Man, Sandman dan Molten Man.",
            R.drawable.spidermanfarhome,
            R.drawable.bg_spiderman_farhome,
            "https://www.marvel.com/movies/spider-man-far-from-home"
        ),
        arrayOf(
            "The Avenger End Game",
            "R 13+ | Super hero | Action ",
            "Sutradara :Anthony Russo",
            "Durasi : 3 Jam 1 Menit",
            "Film Avengers: Endgame merupaka sekuel terakhir dari rangkaian film The Avengers yang berada dalam timeline Marvel Cinematic Universe atau MCU. Film ini menceritakan peristiwa yang terjadi dalam rentang waktu lima tahun berselang dari film sebelumnya, Avengers: Infinity War. Pada Avengers: Infinity War, dikisahkan bahwa setengah populasi dunia hilang karena ulah Thanos.",
            R.drawable.avengerendgame,
            R.drawable.bg_avangerendgame,
            "https://www.marvel.com/movies/avengers-endgame"
        ),
    )

    val listData: ArrayList<Marvel>
        get(){
            val list = ArrayList<Marvel>()
            for (data in database) {
                val marvel = Marvel()
                marvel.name = data[0] as String
                marvel.genre = data[1] as String
                marvel.sutradara =data[2] as String
                marvel.duration = data[3] as String
                marvel.synopsis = data[4] as String
                marvel.pic = data[5] as Int
                marvel.background = data[6] as Int
                marvel.charlink = data[7] as String

                list.add(marvel)
            }
            return list
        }
}