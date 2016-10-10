package io.terminus.parana.store.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author xgs.
 * @Email xgs@terminus.io
 * @Date 16/10/10
 */

@Data
@Table(name = "parana_test_users")
public class UserTest implements Serializable{
    private static final long serialVersionUID = -7006365077642283422L;

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String password;

    private Date createdAt;
    private Date updatedAt;
}
