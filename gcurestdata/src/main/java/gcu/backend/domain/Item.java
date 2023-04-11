@Getter
@NoArgsConstructor(access=AccessLevel.PUBLIC)
@entity
public class Item implements
Serializable{
    @Id
    @Column                     }
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long Id;

    @Column
    private String name;

    @Column
    private int price;

    @Builder
    public Item(String name,int price){
        this.name=name;
        this.price=price;
        }
