package com.aisyah.aisyahuts8.ui.gallery

import com.aisyah.aisyahuts8.Model
import com.aisyah.aisyahuts8.R

object DataSkincare {
    private val namess = arrayOf(
        "Oil Cleanser",
        "Water-Based Cleanser",
        "Exfoliator",
        "Toner",
        "Essence",
        "Moisturizer",
        "Sun Protection"
    )
    private val detailss = arrayOf(
        "Oil Cleanser adalah step pertama dari double cleanse. gak cuma membuat relax ketika kamu memakainya, oil cleanser juga bisa menghapus makeup, sebum, SPF, dan polusi."
        ,
        "Step kedua dari double cleanse. Membersihkan 2 kali sangat direkomendasikan oleh dermatologi karena membantu menghilangkan kotoran yang bisa menyebabkan breakout."
        ,
        "Exfoliater berfungsi untuk membersihkan pori-pori dan sel kulit mati agar wajahmu lebih bersinar dan lembut. Jika kamu rutin memakainya itu bisa membantu roduk skincare yang lain bekerja lebih efektif."
        ,
        "Toner dapat menyeimbangkan kelembapan dan pH kulitmu agar tetap terhidrasi."
        ,
        "Bertekstur ringan dan dikemas dengan bahan-bahan yang melembabkan dan anti-penuaan."
        ,
        "Moisturizer gak kalah penting dari produk skincare yang lain, tujuannya adalah untuk menyegel kelembapan kulitmu agar halus."
        ,
        "Kamu harus memakai sunscreen jika ingin keluar rumah. ini adalah cara termudah dan terefektif untuk mencegah penuaan dini dan kanker kulit."
    )
    private val photoss = intArrayOf(
        R.drawable.oil_cleanser,
        R.drawable.water_based_cleasnser,
        R.drawable.exfoliater,
        R.drawable.toner,
        R.drawable.essence,
        R.drawable.moisturizer,
        R.drawable.sun_protection
    )

    val listData: ArrayList<Model>
        get() {
            val list = arrayListOf<Model>()
            for (position in namess.indices) {
                val model = Model()
                model.name = namess[position]
                model.detail = detailss[position]
                model.photo = photoss[position]
                list.add(model)
            }
            return list
        }
}