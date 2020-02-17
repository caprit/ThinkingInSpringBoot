/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package thinking.in.spring.boot.samples.spring.application.bootstrap;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jmx.export.annotation.AnnotationMBeanExporter;
import thinking.in.spring.boot.samples.spring.application.config.SpringApplicationConfiguration;

/**
 * {@link SpringApplication} 引导类
 *
 * @author <a href="mailto:mercyblitz@gmail.com">Mercy</a>
 * @since 1.0.0
 */
public class SpringApplicationBootstrap {

    public static void main(String[] args) {
        // 启动 Spring Boot 应用
        ConfigurableApplicationContext context = SpringApplication.run(SpringApplicationConfiguration.class, args);
        // 获取 AnnotationMBeanExporter Bean
        AnnotationMBeanExporter beanExporter = context.getBean(AnnotationMBeanExporter.class);
        // 输出 AnnotationMBeanExporter 对象
        System.out.println("AnnotationMBeanExporter Bean : " + beanExporter);
        // 输出 SpringApplicationConfiguration 对象
        System.out.println("SpringApplicationConfiguration Bean : " + context.getBean(SpringApplicationConfiguration.class));
        // 关闭上下文
        context.close();
    }
}
