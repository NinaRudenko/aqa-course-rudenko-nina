enum RoleType{
    Admin,
    MainCustomer,
    Customer,
    Viewer
}
public class Role {
    private boolean viewAll;
    private boolean editAll;
    private boolean addAll;
    private boolean deleteAll;

    public Role(RoleType roleType) {
        switch (roleType) {
            case Admin:
                this.viewAll = true;
                this.editAll = true;
                this.addAll = true;
                this.deleteAll = true;
                break;
            case MainCustomer:
                this.viewAll = true;
                this.editAll = true;
                this.addAll = true;
                this.deleteAll = false;
                break;
            case Customer:
                this.viewAll = true;
                this.editAll = false;
                this.addAll = true;
                this.deleteAll = false;
                break;
            case Viewer:
                this.viewAll = true;
                this.editAll = false;
                this.addAll = false;
                this.deleteAll = false;
                break;
        }
    }
}
