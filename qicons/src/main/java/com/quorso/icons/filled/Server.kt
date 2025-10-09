package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.Server: ImageVector
    get() {
        if (_Server != null) {
            return _Server!!
        }
        _Server = ImageVector.Builder(
            name = "Filled.Server",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.08f, 5.227f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.979f, 3f)
                horizontalLineTo(17.02f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.9f, 2.227f)
                lineToRelative(2.113f, 7.926f)
                arcTo(5.228f, 5.228f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.75f, 12f)
                horizontalLineTo(5.25f)
                arcToRelative(5.228f, 5.228f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.284f, 1.153f)
                lineTo(4.08f, 5.227f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.25f, 13.5f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 7.5f)
                horizontalLineToRelative(13.5f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -7.5f)
                lineTo(5.25f, 13.5f)
                close()
                moveTo(15.75f, 18f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                close()
                moveTo(19.5f, 17.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 0f)
                close()
            }
        }.build()

        return _Server!!
    }

@Suppress("ObjectPropertyName")
private var _Server: ImageVector? = null
