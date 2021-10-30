public class MainActivity extends ActionBarActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<YourClass> list = new ArrayList<YourClass>();
        YourClass yc = new YourClass();
        yc.name = "aaa";
        list.add(yc);
        yc = new YourClass();
        yc.name = "bbb";
        list.add(yc);
        yc = new YourClass();
        yc.name = "ccc";
        list.add(yc);
        ListView mList = (ListView) findViewById(R.id.restRestaurantList);
        YourListAdapter adapter1 = new YourListAdapter(this, android.R.layout.simple_list_item_1, list);
        mList.setAdapter(adapter1);
    }

    public class YourListAdapter extends ArrayAdapter<YourClass>
    {

        ArrayList<YourClass> _List = null;

        public YourListAdapter(Context context, int typ, ArrayList<YourClass> List)
        {
            super(context, typ, List);
            // TODO Auto-generated constructor stub
            mContext = context;
            _List = List;
        }

        private final Context mContext;

        @Override
        public View getView(int position, View convertView, ViewGroup parent)
        {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            TextView rowView = (TextView)inflater.inflate(android.R.layout.simple_list_item_1, parent, false);
            rowView.setText(_List.get(position).toString());
            return rowView;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}