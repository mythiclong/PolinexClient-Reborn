// PX-FIX PhaseA: jar-only nested type restored as SIGNATURE-ONLY STUB (round 12).
// jar class: me.octo.client.lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
package me.octo.client;

public final class lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll extends java.util.LinkedHashMap {
    private static java.lang.String a;
     lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
        super();
    }
    protected boolean removeEldestEntry(java.util.Map.Entry p0) {
       return this.size() > 50;
    }
    public final boolean a(java.lang.Long p0) {
       return super.containsValue(p0);
    }
    public final boolean containsValue(java.lang.Object p0) {
       return this.a((java.lang.Long) p0);
    }
    public java.lang.Long a(java.lang.Float p0) {
       return (java.lang.Long) super.get(p0);
    }
    public final java.lang.Object get(java.lang.Object p0) {
       if (p0 instanceof java.lang.Float) {
          return this.a((java.lang.Float)p0);
       }
       return null;
    }
    public java.lang.Long a(java.lang.Object p0) {
       return this.a((java.lang.Float) p0);
    }
    public final java.lang.Long a(java.lang.Float p0, java.lang.Long p1) {
       return (java.lang.Long) super.getOrDefault(p0, p1);
    }
    public final java.lang.Object getOrDefault(java.lang.Object p0, java.lang.Object p1) {
       return this.a((java.lang.Float) p0, (java.lang.Long) p1);
    }
    public java.lang.Long a(java.lang.Object p0, java.lang.Long p1) {
       return this.a((java.lang.Float) p0, p1);
    }
    public java.util.Collection a() {
       return super.values();
    }
    public java.util.Collection values() {
       return this.a();
    }
    public int b() {
       return super.size();
    }
    public int size() {
       return this.b();
    }
    public final boolean b(java.lang.Float p0) {
       return super.containsKey(p0);
    }
    public final boolean containsKey(java.lang.Object p0) {
       return this.b((java.lang.Float) p0);
    }
    public java.lang.Long c(java.lang.Float p0) {
       return (java.lang.Long) super.remove(p0);
    }
    public final java.lang.Object remove(java.lang.Object p0) {
       return p0 instanceof java.lang.Float ? this.c((java.lang.Float) p0) : null;
    }
    public java.lang.Long b(java.lang.Object p0) {
       return this.c((java.lang.Float) p0);
    }
    public boolean b(java.lang.Float p0, java.lang.Long p1) {
       return super.remove(p0, p1);
    }
    public final boolean remove(java.lang.Object p0, java.lang.Object p1) {
       return this.b((java.lang.Float) p0, (java.lang.Long) p1);
    }
    public java.util.Set c() {
       return super.keySet();
    }
    public java.util.Set keySet() {
       return this.c();
    }
    public java.util.Set d() {
       return super.entrySet();
    }
    public java.util.Set entrySet() {
       return this.d();
    }
    static {
        a = (java.lang.String) null;
    }
}
