package bone.segunda_evaluacion;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by devin on 04/11/2017.
 */

public class AdaptadorImagen extends ArrayAdapter<Imagen> {
Animation anim_combinado;


    public AdaptadorImagen(Context context, List<Imagen> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Obteniendo el dato
        Imagen imagen = getItem(position);
        //Inicializacion del layout correspodiente al item
        if(convertView== null){
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.item, parent,false);
        }
        TextView lblruta= (TextView) convertView.findViewById(R.id.lblNombre);
        ImageView image= (ImageView) convertView.findViewById(R.id.imgProfile);
        //zoom_int
       /* anim_combinado= AnimationUtils.loadAnimation(this,R.anim.zom_in);
        anim_combinado.setDuration(1000);
        anim_combinado.setFillAfter(true);/*/
        // mostrar los datos
        lblruta.setText(imagen.ruta);
        image.setImageBitmap(imagen.imagen);
        // return la convertview
        return  convertView;
    }
}
