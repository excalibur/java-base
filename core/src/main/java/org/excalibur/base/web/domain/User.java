package org.excalibur.base.web.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 用户对象
 *
 * @author faith
 * @since 0.0.1
 */
@Getter
@Setter
@Entity
@Table
public class User extends AbstractEntity<Long> {
    private String username;
    private String nickname;
}
