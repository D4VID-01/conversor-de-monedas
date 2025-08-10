public record Divisa(String base_code,
                     String target_code,
                     double conversion_rate) {

    @Override
    public String toString() {
        return "\nConversión unitaria actual: 1 " + base_code
                + " = " + conversion_rate + " " + target_code+ "\n";
    }

    @Override
    public double conversion_rate() {
        return conversion_rate;
    }
}

