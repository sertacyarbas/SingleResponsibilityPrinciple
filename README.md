# Single Responsibility Principle (SRP) Uygulama Örneği

Bu proje, S.O.L.I.D prensiplerinden ilki olan **Single Responsibility Principle (SRP)**'yi göstermek için hazırlanmıştır. Proje, SRP'yi ihlal eden bir yapıyı ve bu ilkeye uygun olarak yeniden yapılandırılmış bir yapıyı içermektedir.

## Proje Yapısı

Proje, iki ana klasör altında organize edilmiştir:

- **bad**: SRP'nin ihlal edildiği bir yapıyı temsil eder.
- **good**: SRP prensibine uygun olarak yeniden yapılandırılmış yapıyı temsil eder.

### Klasör ve Dosya Yapısı
src/ ├── bad/ │
├── Application.java │ └── InvoiceProcessor.java └── good/ ├── invoice/ │ ├── impl/ │ │ ├── EmailSender.java │ │ ├── InvoiceCreator.java │ │ ├── InvoiceSaver.java │ │ ├── OrderValidator.java │ │ ├── PdfGenerator.java │ │ └── TotalAmountCalculator.java │ ├── Application.java │ ├── InvoiceContext.java │ └── InvoiceProcessor.java └── model/ ├── Customer.java ├── Invoice.java └── Order.java
![image](https://github.com/user-attachments/assets/bbfc4f27-c379-4b07-9edf-7776bc72bcd8)


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
