package Classe_Point2;


    class	Point
    {	public	Point	(char	c,	double	x)			//	constructeur
    {	this.nom	=	c	;
        this.abs	=	x	;
    }
        public	void	affiche	()
        {	 System.out.println	 ("Point	 de	 nom	 "	 +	 nom	 +	 "	 d'abscisse	 "	 +
                abs)	;
        }
        public	void	translate	(double	dx)
        {	abs	+=	dx	;
        }
        private	char	nom	;					//	nom	du	point
        private	double	abs	;			//	abscisse	du	point
    }


