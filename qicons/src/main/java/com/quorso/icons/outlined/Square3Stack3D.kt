package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.Square3Stack3D: ImageVector
    get() {
        if (_Square3Stack3D != null) {
            return _Square3Stack3D!!
        }
        _Square3Stack3D = ImageVector.Builder(
            name = "Outlined.Square3Stack3D",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.429f, 9.75f)
                lineTo(2.25f, 12f)
                lineToRelative(4.179f, 2.25f)
                moveToRelative(0f, -4.5f)
                lineToRelative(5.571f, 3f)
                lineToRelative(5.571f, -3f)
                moveToRelative(-11.142f, 0f)
                lineTo(2.25f, 7.5f)
                lineTo(12f, 2.25f)
                lineToRelative(9.75f, 5.25f)
                lineToRelative(-4.179f, 2.25f)
                moveToRelative(0f, 0f)
                lineTo(21.75f, 12f)
                lineToRelative(-4.179f, 2.25f)
                moveToRelative(0f, 0f)
                lineToRelative(4.179f, 2.25f)
                lineTo(12f, 21.75f)
                lineTo(2.25f, 16.5f)
                lineToRelative(4.179f, -2.25f)
                moveToRelative(11.142f, 0f)
                lineToRelative(-5.571f, 3f)
                lineToRelative(-5.571f, -3f)
            }
        }.build()

        return _Square3Stack3D!!
    }

@Suppress("ObjectPropertyName")
private var _Square3Stack3D: ImageVector? = null
