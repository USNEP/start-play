package models;

    import java.util.*;
    import javax.persistence.*;
    import play.db.ebean.*;
    import play.data.format.*;
    import play.data.validation.*;

    @Entity
   @Table(name = "Products")
    public class Product extends com.avaje.ebean.Model  {

    @Id
    public Long id;

    @Column
    @Constraints.Required
    public String name;

    public Product(){

    }

    public Product(Long id,String name){
      this.id = id;
      this.name= name;
    }

    public static Finder<Long, Product> find = new Finder<Long, Product>(
      Long.class, Product.class
    );

    public Long getId() {
      return id;
    }
    public void setId(Long id) {
      this.id = id;
    }
    public String getName() {
      return name;
    }
    public void setName(String name) {
      this.name = name;
    }
}