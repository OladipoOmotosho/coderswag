package Services

import Model.Category
import Model.Product

object DataService {
    val categories= listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie", "$18", "hat01"),
        Product("Devslopes Hat Black", "$20", "hat02"),
        Product("Devslopes Hat White", "$18", "hat03"),
        Product("Devslopes Hat Snapback", "$22", "hat04")

    )

    val hoodies = listOf(
        Product("Deveslopes Hoodie Gray", "$28", "hoodie01"),
        Product("Deveslopes Hoodie Red", "$32", "hoodie02"),
        Product("Deveslopes Gray Hoodie ", "$28", "hoodie03"),
        Product("Deveslopes Black Hoodie ", "$32", "hoodie04")

    )


    val shirts = listOf(
        Product("Deveslopes shirt Black", "$28", "hoodie01"),
        Product("Deveslopes Badge Light Gray", "$32", "shirts02"),
        Product("Deveslopes Logo Shirt Red ", "$28", "shirts03"),
        Product("Deveslopes Hustles ", "$32", "shirts04"),
        Product("Kickflip", "$32", "shirts05")



    )

}