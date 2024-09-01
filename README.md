# Single Responsibility Principle (SRP) Uygulama Örneği

Bu proje, S.O.L.I.D prensiplerinden ilki olan **Single Responsibility Principle (SRP)**'yi göstermek için hazırlanmıştır. Proje, SRP'yi ihlal eden bir yapıyı ve bu ilkeye uygun olarak yeniden yapılandırılmış bir yapıyı içermektedir.

## Proje Yapısı

Proje, iki ana klasör altında organize edilmiştir:

- **bad**: SRP'nin ihlal edildiği bir yapıyı temsil eder.
- **good**: SRP prensibine uygun olarak yeniden yapılandırılmış yapıyı temsil eder.

### Klasör ve Dosya Yapısı
![image](https://github.com/user-attachments/assets/a9e6dbf4-5786-45ae-a629-fd4a2dca410d)

### Klasörlerin Açıklamaları

- **bad**: Bu klasörde, `InvoiceProcessor.java` sınıfı çok sayıda sorumluluğu üstlenmektedir. Bu yapı, SRP'yi ihlal eden bir örnek teşkil eder.
  
- **good**: Bu klasörde, SRP'ye uygun olarak yeniden yapılandırılmış bir yapıyı bulabilirsiniz. `invoice/impl` alt klasöründe her sınıf yalnızca bir sorumluluğa sahiptir. Örneğin, `EmailSender.java` sadece e-posta gönderimiyle ilgilenir, `InvoiceCreator.java` ise sadece fatura oluşturma işlemiyle ilgilenir.

- **model**: Bu klasör, fatura işlemlerinde kullanılan `Customer`, `Invoice` ve `Order` gibi modelleri içerir.

## Nasıl Çalıştırılır

### SRP İhlali Örneği (bad)

SRP'nin ihlal edildiği yapıyı çalıştırmak için `bad/Application.java` dosyasını çalıştırın. Bu yapı, birçok sorumluluğun tek bir sınıfta toplandığı bir yapıyı göstermektedir.

### SRP'ye Uygun Örnek (good)

SRP prensibine uygun yapıyı görmek için `good/invoice/Application.java` dosyasını çalıştırın. Bu yapı, her sınıfın sadece tek bir sorumluluğa sahip olduğu daha modüler ve sürdürülebilir bir yapı sunar.

## Neden SRP?

**Single Responsibility Principle**, bir sınıfın veya modülün karmaşıklığını azaltarak, kodun bakımını ve test edilmesini kolaylaştırır. SRP'ye uygun yapılar, kodun tekrar kullanılabilirliğini artırır ve hata yapma olasılığını azaltır.
