package com.chandraayunda_19102301.pertemuan5

object DataSample {
    private val namaSampel= arrayOf(
        "Baturaden",
        "Small World",
        "Watu Jajar"
    )
    private val deskripsiSampel= arrayOf(
        "Desa Wisata yang Ada di Banyumas",
        "Miniatur Dunia",
        "Pemandangan Indah dari Atas Bukit"
    )
    private val gambarSampel= intArrayOf(
        R.drawable.baturaden_1,
        R.drawable.smallworld_1,
        R.drawable.watu_meja1
    )
    private val latSampel = doubleArrayOf(
        -7.3228088,
        -7.3327697,
        -7.5190073
    )
    private val longSampel = doubleArrayOf(
        109.1504183,
        109.2229267,
        109.2123145
    )
    val listData: ArrayList<DataClassWisata>
    get(){
        val listDataku = arrayListOf<DataClassWisata>()
        for (position in namaSampel.indices){
            val data = DataClassWisata()
            data.namaWisata = namaSampel[position]
            data.deskripsi = deskripsiSampel[position]
            data.sampleImage = gambarSampel[position]
            data.lat = latSampel[position]
            data.long = longSampel[position]
            listDataku.add(data)
        }
        return listDataku
    }
}