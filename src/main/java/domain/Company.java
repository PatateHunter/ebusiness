package domain;

public class Company {
   private CompanyName name;
   private CompanyId id;

    public Company(CompanyName name,CompanyId id) {
        this.name = name;
        this.id = id;
    }

    public CompanyName getName() {
        return name;
    }

    public CompanyId getId() {
        return id;
    }
}
