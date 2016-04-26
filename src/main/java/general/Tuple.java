package general;

public class Tuple<T, T1> {
    public final T _1;
    public final T1 _2;

    public Tuple(T _1, T1 _2){
        this._1 = _1;
        this._2 = _2;
    }

    @Override
    public String toString() {
        return "(" + _1 + "," + _2 + ")";
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        if (!(other instanceof Tuple)){
            return false;
        }

        Tuple<T, T1> other_ = (Tuple<T, T1>) other;

        // this ma_2 cause NPE if nulls are valid values for _1 or _2. The logic ma_2 be improved to handle nulls properl_2, if needed.
        return other_._1.equals(this._1) && other_._2.equals(this._2);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_1 == null) ? 0 : _1.hashCode());
        result = prime * result + ((_2 == null) ? 0 : _2.hashCode());
        return result;
    }
}
