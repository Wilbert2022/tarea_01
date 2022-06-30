package ExamenWAMA;

/**
 * EjercicioNro3
 */
public class EjercicioNro3 {

    main()
    float a, b,;
    float x;
    int l;

    printf("Ingresa 2 numeros rale:");
    scanf("%f %f", &a, &b);

    printf("Ingresa la operación deseada: +-suma, --resta, *-multiplicion, /-division, %-Porcentaje, ^-potencia, R-raiz:");
    scanf("%d", &l);

    switch(l)
    {
    case 1:
        {
            x=a+b;
            printf("%f", x);
            break;
        }
    case 2:
        {
            x=a-b;
            printf("%f", x);
            break;
        }
    case 3:
        {
            x=a*b;
            printf("%f", x);
            break;
        }
        case 4:
        {
            x=a/b;
            printf("%f", x);
            break;
        }
        case 5:
        {
            x=a % b;
            printf("%f", x);
            break;
        }
        case 5:
        {
            x=a Potencia() b;
            printf("%f", x);
            break;
        }
        case 6:
        {
            x=a sqrt() b;
            printf("%f", x);
            break;
        }
    default:
            {
                printf("Opcion no valida");
                break; 
            }
    }

    system("pause");
}

