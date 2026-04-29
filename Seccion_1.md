Esta es la sección uno del examen con el diagrama de C4 de Structurizer, la lógica detras del mismo es así.
1A (Contexto): El sistema Sistema de Biblioteca en el centro, los 4 actores (Estudiante, Bibliotecario, Admin, Sistema Bancario), y los 3 sistemas externos (Catálogo CETYS, Pagos Bancario, Directorio Institucional).
![System Context](./Diagrama%20C4/System%20Context_%20Sistema%20de%20Biblioteca%20CetysContexto-dark.png)
1B (Contenedores): Distribuido en 5 contenedores, siendo Web App, API Backend, Base de Datos, Worker de Notificaciones, y un Message Broker.
![System Context](./Diagrama%20C4/Container%20View_%20Sistema%20de%20Biblioteca%20CetysContenedores-dark.png)
1C (Componentes del API Backend): Aquí están los componentes dentro del contenedor de API, con un AuditoriaLogger que es Singleton, una FabricaDeUsuarios que pues es Factory, un CatalogoCETYSAdapter que pues es Adapter, un SolicitudPrestamoBuilder que igual pues es un Builder, más los use cases y controllers. 
![System Context](./Diagrama%20C4/Component_View_Sistema_de_Biblioteca_CetysComponentes-dark.png)