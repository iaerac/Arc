package a.b.c.type;

import io.github.wangyuheng.arc.dgraph.annotation.DgraphType;
import io.github.wangyuheng.arc.dgraph.annotation.UidField;
import io.github.wangyuheng.arc.dgraph.dictionary.IDomainClass;
import io.github.wangyuheng.arc.graphql.annotation.Graphql;
import java.lang.String;

/**
 * Milestone
 * Generate with GraphQL Schema
 *
 * @author Arc
 */
@Graphql
@DgraphType("MILESTONE")
public class Milestone implements IDomainClass {
  /**
   * id
   */
  @UidField
  private String id;

  /**
   * name
   */
  private String name;

  public Milestone(String id, String name) {
    this.id = id;
    this.name = name;
  }

  public Milestone() {
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getId() {
    return id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public static MilestoneBuilder builder() {
    return new MilestoneBuilder();
  }

  public static class MilestoneBuilder {
    private String id;

    private String name;

    private MilestoneBuilder() {
    }

    public MilestoneBuilder id(String id) {
      this.id = id;
      return this;
    }

    public MilestoneBuilder name(String name) {
      this.name = name;
      return this;
    }

    public Milestone build() {
      return new Milestone(id,name);
    }
  }
}