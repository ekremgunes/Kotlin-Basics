fun kucukBitmapOlustur(kullanicininBitmap : Bitmap , MaximumBoyut :Int): Bitmap? {

        var width = kullanicininBitmap.width
        var height = kullanicininBitmap.height
        val bitmapOran = width.toDouble()  / height.toDouble()

        if(bitmapOran > 1 ){
            //görsel yataydır
            width = MaximumBoyut;
            var kisaltilmisHeight = width / bitmapOran
            height = kisaltilmisHeight.toInt()


        }else{
            height = MaximumBoyut;
            var kisaltilmisWidth = height * bitmapOran
            width = kisaltilmisWidth.toInt()

        }

        return Bitmap.createScaledBitmap(kullanicininBitmap,width,height,true)


    }
