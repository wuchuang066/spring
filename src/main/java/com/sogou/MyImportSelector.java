package com.sogou;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {

	// 返回值：就是要导入到容器中的组件的全类名
	// AnnotationMetadata：当前标注@Import注解的类的所有注解信息，也就是说不仅能获取到@Import注解里面的信息，还能获取到其他注解的信息
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) { // 在这一行打个断点，debug调试一下
		
		// 方法不要返回null值，否则会报空指针异常
//		return new String[]{}; // 可以返回一个空数组
		return new String[]{"com.meimeixia.bean.Bule", "com.meimeixia.bean.Yellow"};
	}

}
