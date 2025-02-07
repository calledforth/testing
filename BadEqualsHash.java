public class BadEqualsHash {
    private int value;

    public BadEqualsHash(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        BadEqualsHash other = (BadEqualsHash) obj;
        return value == other.value;
    }

    // Bad practice: not overriding hashCode when equals is overridden
}
