package org.springframework.datastore.graph.api;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Michael Hunger
 * @since 27.08.2010
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface GraphEntityRelationship {
    String type();

    Direction direction() default Direction.OUTGOING;

    Class<? extends NodeBacked> elementClass() default NodeBacked.class;
}