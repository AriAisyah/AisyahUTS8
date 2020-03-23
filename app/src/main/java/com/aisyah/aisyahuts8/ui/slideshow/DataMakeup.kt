package com.aisyah.aisyahuts8.ui.slideshow

import com.aisyah.aisyahuts8.Model
import com.aisyah.aisyahuts8.R

object DataMakeup {

    private val namesm = arrayOf(
        "Foundation",
        "Blush On",
        "Powder",
        "Eyeliner",
        "Eyebrow Pencil",
        "Eyeshadow",
        "Lipstick"
    )
    private val detailsm = arrayOf(
        "Alas bedak ini merupakan pondasi utama dalam bermake up. Fungsinya supaya warna kulit merata dan menutupi bintik hitam serta jerawat pada wajah secara sempurna. Namun penggunaanya disesuaikan dengan acara kalian para ladies."
        ,
        "Menggunakan blush on pada wajah bertujuan supaya pipi tampak merona dan berseri. Pengaplikasianya pun cukum mudah yaitu sapuhkan blush on menggunakan alat brush pada tulang pipi secara merata dan tipis hingga warnanya terlihat."
        ,
        "Bedak ada dua macam yaitu tabur dan padat. Tekstur pada bedak tabur lebih ringan jika digunakan pada wajah dan sangat cocok dipakai oleh pemula yang sedang belajar make up. Sedangkan tekstur bedak padat lebih berat diwajah . fungsinya keduanya sama-sama mampu menyerap keringat dan minyak pada wajah."
        ,
        "Penggunaan eyeliner dapat menyempurnakan garis mata secara tegas. Bagi yang memiliki bentuk mata yang kecil eyeliner ini sangat dibutuhkan untuk dapat memperbesar bentuk mata."
        ,
        "Alis merupakan bingkai bagi keberadaan mata, tentunya kamu mau dong punya bingkai mata yang bagus. Nah untuk mempercantik alis ini digunakanlah pensil alis gunanya untuk mempertegas, merapihkan dan mempertebal bentuk alis."
        ,
        "Ingin kelopak matamu berwarna? Cukup aplikasikan eyeshadow pada kelopak matamu mengikuti bentuknya. Untuk kegiatan sehari-hari cukup aplikasikan warna yang natural sedangkan untuk acara formal bisa dipadukan dengan warna yang lebih terang."
        ,
        "Salah satu jenis make up yang paling terpenting adalah Lipstik. Lipstik dapat membuat wajahmu telihat mempesona dan lebih berwarna. Cukup pilih warna lipstik yang cocok dengan warna kulit maka tampilanmu akan terlihat sempurna."
    )

    private val photosm = intArrayOf(
        R.drawable.foundation1,
        R.drawable.blush_on2,
        R.drawable.powder3,
        R.drawable.eyeliner4,
        R.drawable.pencil5,
        R.drawable.eyeshadow6,
        R.drawable.lipstick7
    )

    val listData: ArrayList<Model>
        get() {
            val list = arrayListOf<Model>()
            for (position in namesm.indices) {
                val model = Model()
                model.name = namesm[position]
                model.detail = detailsm[position]
                model.photo = photosm[position]
                list.add(model)
            }
            return list
        }

}