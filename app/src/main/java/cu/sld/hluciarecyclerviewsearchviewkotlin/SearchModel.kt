package cu.sld.hluciarecyclerviewsearchviewkotlin

class SearchModel {

    var name: String? = null
    private val image_drawable: Int = 0

    fun getNames(): String {
        return name.toString()
    }

    fun setNames(name: String) {
        this.name = name
    }
}