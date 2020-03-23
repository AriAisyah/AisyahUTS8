package com.aisyah.aisyahuts8.ui.home

import com.aisyah.aisyahuts8.Model
import com.aisyah.aisyahuts8.R

object DataBodycare {

    private val namesb = arrayOf(
        "Body Oil",
        "Body Lotion",
        "Body Butter",
        "Body Milk",
        "Body Serum",
        "Body Cream",
        "Body Mist"
    )
    private val detailsb = arrayOf(
        "Body Oil adalah salah satu produk perawatan badan yang sebenarnya belum ramai di Indonesia. Namun bukan berarti belum beredar dipasaran. Body Oil berfungsi untuk kamu yang punya kulit badan yang sangat kering. Body Oil ini bisa berupa minyak zaitun, ataupun minyak lainnya yang berasal dari bunga atau olahan buah-buahan."
        ,
        "Body Lotion, produk ini adalah produk perawatan badan yang paling umum di Indonesia. Selain karena teksturnya yang tidak terlalu encer ataupun padat. Body Lotion biasanya juga dilengkapi kandungan vitamin dan SPF yang membuatnya menjadi produk All in One yang digemari semua orang."
        ,
        "Body Butter adalah produk yang sebenarnya telah lama bersandingan dengan body lotion dipasaran. Body Butter menawarkan tekstur yang lebih kental dengan kandungan minyak yang tinggi. Hal ini menyebabkan body butter menjadi varian produk yang paling lama menyerap dikulit."
        ,
        "Produk ini cocok buat kamu yang ingin menghaluskan dan meratakan warna kulit. Teksturnya yang lebih encer membuat produk ini jauh lebih cepat menyerap dibanding body lotion. Kandungan susu didalamnya akan membuat kulit lebih cerah."
        ,
        "Jika kamu belum puas dengan body milk, body serum bisa menjadi pilihanmu untuk lotion yang ringan namun tetap memiliki banyak manfaat. Sesuai dengan sebutannya, body serum memiliki konsentrat formula yang lebih tinggi dibanding produk ringan lainnya seperti body milk/lotion. Biasanya disarankan menggunakannya di malam hari untuk mendapatkan hasil yang maksimal."
        ,
        "Body Cream adalah produk yang berada dipertengahan antara body butter dan body lotion. Body Cream adalah jalan tengah bagi kamu yang merasa belum puas dengan body lotion namun juga tidak ingin produk yang berat seperti body butter. Tentu body cream juga cocok digunakan sehari-hari sebelum beraktivitas."
        ,
        "Terakhir adalah sentuhan fragrance tambahan, yakni eau fraiche atau biasa yang disebut body mist. Body mist pada dasarnya akan meningkatkan aroma dan kesegaran kamu saat beraktivitas. Sedikit tips untuk kamu, ada baiknya memastikan bahwa body mist telah benar-benar menyerap dikulit sebelum menggunakan pakaian agar wanginya lebih tahan lama."
    )

    private val photosb = intArrayOf(
        R.drawable.body_oil1,
        R.drawable.body_lotion2,
        R.drawable.body_butter3,
        R.drawable.body_milk4,
        R.drawable.body_serum5,
        R.drawable.body_cream6,
        R.drawable.body_mist
    )

    val listData: ArrayList<Model>
        get() {
            val list = arrayListOf<Model>()
            for (position in namesb.indices) {
                val model = Model()
                model.name = namesb[position]
                model.detail = detailsb[position]
                model.photo = photosb[position]
                list.add(model)
            }
            return list
        }

}