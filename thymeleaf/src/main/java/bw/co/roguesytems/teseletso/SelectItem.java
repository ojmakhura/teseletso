package bw.co.roguesytems.teseletso;

import java.io.Serializable;

public class SelectItem<E, T> implements Serializable {
    private E label;
    private T value;

    public SelectItem() {
    }

    public SelectItem(E label, T value) {
        this.label = label;
        this.value = value;
    }

    public E getLabel() {
        return label;
    }

    public void setLabel(E label) {
        this.label = label;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        
        StringBuilder builder = new StringBuilder();

        builder.append("{\n");
        builder.append("\t\"label\" : \"" + this.getLabel() + "\",\n");
        builder.append("\t\"value\" : \"" + this.getValue() + "\"\n");
        builder.append("}\n");

        return builder.toString();
    }

}