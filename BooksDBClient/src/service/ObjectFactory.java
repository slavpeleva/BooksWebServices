
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _InsertAuthorResponse_QNAME = new QName("http://service/", "insertAuthorResponse");
    private final static QName _InsertBookResponse_QNAME = new QName("http://service/", "insertBookResponse");
    private final static QName _ShowAuthorsResponse_QNAME = new QName("http://service/", "showAuthorsResponse");
    private final static QName _InsertAuthor_QNAME = new QName("http://service/", "insertAuthor");
    private final static QName _Delete_QNAME = new QName("http://service/", "delete");
    private final static QName _InsertBook_QNAME = new QName("http://service/", "insertBook");
    private final static QName _Update_QNAME = new QName("http://service/", "update");
    private final static QName _DelBooksAndAuthors_QNAME = new QName("http://service/", "delBooksAndAuthors");
    private final static QName _DeleteResponse_QNAME = new QName("http://service/", "deleteResponse");
    private final static QName _ShowAuthors_QNAME = new QName("http://service/", "showAuthors");
    private final static QName _DelBooksAndAuthorsResponse_QNAME = new QName("http://service/", "delBooksAndAuthorsResponse");
    private final static QName _ShowBookByAuthor_QNAME = new QName("http://service/", "showBookByAuthor");
    private final static QName _ShowBookByAuthorResponse_QNAME = new QName("http://service/", "showBookByAuthorResponse");
    private final static QName _UpdateResponse_QNAME = new QName("http://service/", "updateResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ShowAuthorsResponse }
     * 
     */
    public ShowAuthorsResponse createShowAuthorsResponse() {
        return new ShowAuthorsResponse();
    }

    /**
     * Create an instance of {@link InsertAuthorResponse }
     * 
     */
    public InsertAuthorResponse createInsertAuthorResponse() {
        return new InsertAuthorResponse();
    }

    /**
     * Create an instance of {@link InsertBookResponse }
     * 
     */
    public InsertBookResponse createInsertBookResponse() {
        return new InsertBookResponse();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link InsertBook }
     * 
     */
    public InsertBook createInsertBook() {
        return new InsertBook();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link InsertAuthor }
     * 
     */
    public InsertAuthor createInsertAuthor() {
        return new InsertAuthor();
    }

    /**
     * Create an instance of {@link ShowAuthors }
     * 
     */
    public ShowAuthors createShowAuthors() {
        return new ShowAuthors();
    }

    /**
     * Create an instance of {@link DelBooksAndAuthors }
     * 
     */
    public DelBooksAndAuthors createDelBooksAndAuthors() {
        return new DelBooksAndAuthors();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link ShowBookByAuthor }
     * 
     */
    public ShowBookByAuthor createShowBookByAuthor() {
        return new ShowBookByAuthor();
    }

    /**
     * Create an instance of {@link ShowBookByAuthorResponse }
     * 
     */
    public ShowBookByAuthorResponse createShowBookByAuthorResponse() {
        return new ShowBookByAuthorResponse();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link DelBooksAndAuthorsResponse }
     * 
     */
    public DelBooksAndAuthorsResponse createDelBooksAndAuthorsResponse() {
        return new DelBooksAndAuthorsResponse();
    }

    /**
     * Create an instance of {@link Author }
     * 
     */
    public Author createAuthor() {
        return new Author();
    }

    /**
     * Create an instance of {@link Books }
     * 
     */
    public Books createBooks() {
        return new Books();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertAuthorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "insertAuthorResponse")
    public JAXBElement<InsertAuthorResponse> createInsertAuthorResponse(InsertAuthorResponse value) {
        return new JAXBElement<InsertAuthorResponse>(_InsertAuthorResponse_QNAME, InsertAuthorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "insertBookResponse")
    public JAXBElement<InsertBookResponse> createInsertBookResponse(InsertBookResponse value) {
        return new JAXBElement<InsertBookResponse>(_InsertBookResponse_QNAME, InsertBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowAuthorsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "showAuthorsResponse")
    public JAXBElement<ShowAuthorsResponse> createShowAuthorsResponse(ShowAuthorsResponse value) {
        return new JAXBElement<ShowAuthorsResponse>(_ShowAuthorsResponse_QNAME, ShowAuthorsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertAuthor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "insertAuthor")
    public JAXBElement<InsertAuthor> createInsertAuthor(InsertAuthor value) {
        return new JAXBElement<InsertAuthor>(_InsertAuthor_QNAME, InsertAuthor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "insertBook")
    public JAXBElement<InsertBook> createInsertBook(InsertBook value) {
        return new JAXBElement<InsertBook>(_InsertBook_QNAME, InsertBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Update }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "update")
    public JAXBElement<Update> createUpdate(Update value) {
        return new JAXBElement<Update>(_Update_QNAME, Update.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelBooksAndAuthors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "delBooksAndAuthors")
    public JAXBElement<DelBooksAndAuthors> createDelBooksAndAuthors(DelBooksAndAuthors value) {
        return new JAXBElement<DelBooksAndAuthors>(_DelBooksAndAuthors_QNAME, DelBooksAndAuthors.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowAuthors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "showAuthors")
    public JAXBElement<ShowAuthors> createShowAuthors(ShowAuthors value) {
        return new JAXBElement<ShowAuthors>(_ShowAuthors_QNAME, ShowAuthors.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelBooksAndAuthorsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "delBooksAndAuthorsResponse")
    public JAXBElement<DelBooksAndAuthorsResponse> createDelBooksAndAuthorsResponse(DelBooksAndAuthorsResponse value) {
        return new JAXBElement<DelBooksAndAuthorsResponse>(_DelBooksAndAuthorsResponse_QNAME, DelBooksAndAuthorsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowBookByAuthor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "showBookByAuthor")
    public JAXBElement<ShowBookByAuthor> createShowBookByAuthor(ShowBookByAuthor value) {
        return new JAXBElement<ShowBookByAuthor>(_ShowBookByAuthor_QNAME, ShowBookByAuthor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowBookByAuthorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "showBookByAuthorResponse")
    public JAXBElement<ShowBookByAuthorResponse> createShowBookByAuthorResponse(ShowBookByAuthorResponse value) {
        return new JAXBElement<ShowBookByAuthorResponse>(_ShowBookByAuthorResponse_QNAME, ShowBookByAuthorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "updateResponse")
    public JAXBElement<UpdateResponse> createUpdateResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateResponse_QNAME, UpdateResponse.class, null, value);
    }

}
