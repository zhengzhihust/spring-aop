һ���򵥵���ApplicationContext�����ԵĻ�,���Spring�ж����Beanʵ��(����).������:
ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
RegisterDAO registerDAO = (RegisterDAO)ac.getBean("RegisterDAO");
�������������:
ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml","dao.xml"});
������ͨ���:
ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:/*.xml");

����ClassPathXmlApplicationContext[ֻ�ܶ�����web-info/classesĿ¼�µ������ļ�]��FileSystemXmlApplicationContext������
classpath:ǰ׺�ǲ���Ҫ��,Ĭ�Ͼ���ָ��Ŀ��classpath·������;
���Ҫʹ�þ���·��,��Ҫ����file:ǰ׺��ʾ���Ǿ���·��;
����FileSystemXmlApplicationContext:
Ĭ�ϱ�ʾ��������:
1.û���̷�������Ŀ����·��,����Ŀ�ĸ�Ŀ¼;
2.���̷���ʾ�����ļ�����·��.
���Ҫʹ��classpath·��,��Ҫǰ׺classpath:
public class HelloClient {
protected static final Log log = LogFactory.getLog(HelloClient.class);
public static void main(String[] args) {
// Resource resource = new ClassPathResource("appcontext.xml");
// BeanFactory factory = new XmlBeanFactory(resource);
// ��classpath·��
// ApplicationContext factory = new ClassPathXmlApplicationContext("classpath:appcontext.xml");
// ApplicationContext factory = new ClassPathXmlApplicationContext("appcontext.xml");
// ClassPathXmlApplicationContextʹ����fileǰ׺�ǿ���ʹ�þ���·����
// ApplicationContext factory = new ClassPathXmlApplicationContext("file:F:/workspace/example/src/appcontext.xml");
// ���ļ�ϵͳ��·��,Ĭ��ָ��Ŀ�ĸ�·��
// ApplicationContext factory = new FileSystemXmlApplicationContext("src/appcontext.xml");
// ApplicationContext factory = new FileSystemXmlApplicationContext("webRoot/WEB-INF/appcontext.xml");

// ʹ����classpath:ǰ׺,����,FileSystemXmlApplicationContextҲ�ܹ���ȡclasspath�µ����·��
// ApplicationContext factory = new FileSystemXmlApplicationContext("classpath:appcontext.xml");
// ApplicationContext factory = new FileSystemXmlApplicationContext("file:F:/workspace/example/src/appcontext.xml");
// ����fileǰ׺
ApplicationContext factory = new FileSystemXmlApplicationContext("F:/workspace/example/src/appcontext.xml");
IHelloWorld hw = (IHelloWorld)factory.getBean("helloworldbean");
log.info(hw.getContent("luoshifei"));
}
}