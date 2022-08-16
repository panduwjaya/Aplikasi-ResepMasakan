package com.example.resepmasakan

object ResepData {
    private val namaResep = arrayOf(
        "Bakso Malang",
        "Jagung Bakar",
        "Ketoprak",
        "Mie Ayam",
        "Nasi Goreng",
        "Opor Ayam",
        "Pecel",
        "Pecel Lele",
        "Rendang",
        "Sate")

    private val detailResep = arrayOf(
        "Bahan membuat bakso sapi yang satu ini terbuat dari daging paha tanpa lemak, es batu, tepung sagu, garam, dan air untuk merebus. Selain bahannya yang sederhana, cara membuat bakso sapi blender ini juga praktis karena semua bahan dimasukkan dalam mesin penghancur.",
        "Bikin saus olesan, aduk rata bawang putih, saus sambal, saus tomat, gula pasir, dan margarin.Bakar jagung manis sambil diolesi bahan olesan sampai matang.",
        "Rendam tahu dalam larutan garam, bawang putih, dan air. Goreng tahu sampai matang. Potong-potong. 2. Sambal kacang: ulek cabai rawit, bawang putih, garam, dan gula merah. Masukkan kacang tanah. Ulek rata. Tambahkan air dan air asam. Ulek lagi sampai semua bahan tercampur.",
        "Siapkan wajan bersih, tuang minyak, dan panaskan. Tumis bumbu halus, daun salam, serai, dan daun bawang sampai wangi. 2. Masukkan ayam dan air. Rebus hingga air mendidih. 3. Tambahkan kecap, garam, merica, dan kaldu bubuk. Masak sampai bumbu meresap dan kuah mengental. Angkat, siap untuk digunakan.",
        "Panaskan minyak. Tumis bumbu tumbuk kasar sampai harum. Sisihkan di pinggir wajan. Masukkan telur. Aduk sampai berbutir. Tambahkan ayam, udang, bakso. Aduk rata. Tambahkan nasi putih. Aduk- aduk. Masukkan KECAP MANIS BANGO, garam, dan gula pasir. Aduk sampai matang.Masukkan daun bawang. Aduk rata. Sajikan bersama telur ceplok dan taburan bawang merah goreng.",
        "Tumis bumbu halus dengan daun salam, daun jeruk, serai, dan lengkuas hingga harum. Masukkan ayam, aduk hingga berubah warna. Tuang air, masukkan asam jawa, gula pasir, dan kaldu bubuk, aduk kembali. Masak dengan api sedang hingga ayam lunak dan air menyusut. Tambahkan santan, masak kembali hingga matang dan bumbu meresap. Angkat, taburi dengan bawang goreng. Sajikan.",
        "Cuci bersih semua bahan sayuran, Setelah itu rebus daun kangkung, kacang panjang yang suah di potong, dan kecambah. Kemudian potong mentimunnya sesuai selera.Kemudian masukkan kedalam ulekan tambahkan asam jawa, gula merah, dan garam. haluskan sampai benar-benar halus. Setelah itu haluskan kacang tanah goreng dengan blender",
        "Siapkan lele yang sudah dibersihkan ke dalam wadah bersih. Rendam lele dengam larutan bumbu perendam. Biarkan 30 menit agar bumbu meresap.Sambal pecel lele: Campurkan semua bahan lele di cobek. Ulek hingga dirasa sudah lembut.",
        "Masukkan daging, aduk rata, lalu masukkan santan. Masak dengan api kecil sambil sesekali diaduk.Kemudian masukkan garam, kaldu, jintan, merica dan gula merah, diamkan hingga bumbu meresap dan airnya menyusut.",
        "Tusuk daging ayam yang sudah dipisahkan dari tulang nya,kemudian daging ayam dimasukan kedalam bumbu yang sudah dibuat menggunakan bumbu pilihan kemudian panggang daging ayam diatas bara api yang menyala hingga daging ayam matang")

    private val resepImages = intArrayOf(
        R.drawable.bakso,
        R.drawable.jagung_bakar,
        R.drawable.ketoprak,
        R.drawable.mie_ayam,
        R.drawable.nasi_goreng,
        R.drawable.opor,
        R.drawable.pecel,
        R.drawable.pecel_lele,
        R.drawable.rendang,
        R.drawable.sate)

    val listDataResep: ArrayList<Resep>
        get() {
            val list = arrayListOf<Resep>()
            for (position in namaResep.indices) {
                val resepMasakan = Resep()
                resepMasakan.nama = namaResep[position]
                resepMasakan.detail = detailResep[position]
                resepMasakan.photo = resepImages[position]
                list.add(resepMasakan)
            }
            return list
        }


}