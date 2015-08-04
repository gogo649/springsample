/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anyun.sample.db.doma;

import org.seasar.doma.AnnotateWith;
import org.seasar.doma.Annotation;
import org.seasar.doma.AnnotationTarget;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author twitchgg
 */
@AnnotateWith(annotations = {
    @Annotation(target = AnnotationTarget.CLASS, type = Component.class),
//		@Annotation(target = AnnotationTarget.CLASS, type = Repository.class),
    @Annotation(target = AnnotationTarget.CONSTRUCTOR, type = Autowired.class)
})
public @interface ConfigAutowireable {
}
