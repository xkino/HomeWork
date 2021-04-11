public enum TypeSubscription {
    ONETIME(new TypeZone[]{TypeZone.POOL, TypeZone.GYM}),
    DAY(new TypeZone[]{TypeZone.GYM, TypeZone.GROUP}),
    FULL(new TypeZone[]{TypeZone.GROUP, TypeZone.POOL, TypeZone.GYM});

    private TypeZone[] typeZones;

     TypeSubscription(TypeZone[] typeZones) {
        this.typeZones = typeZones;
    }

    public TypeZone[] getTypeZones() {
        return typeZones;
    }
}
