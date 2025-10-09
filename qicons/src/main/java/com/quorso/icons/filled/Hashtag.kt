package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.Hashtag: ImageVector
    get() {
        if (_Hashtag != null) {
            return _Hashtag!!
        }
        _Hashtag = ImageVector.Builder(
            name = "Filled.Hashtag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.097f, 1.515f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.589f, 0.882f)
                lineTo(10.666f, 7.5f)
                horizontalLineToRelative(4.47f)
                lineToRelative(1.079f, -5.397f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.47f, 0.294f)
                lineTo(16.665f, 7.5f)
                horizontalLineToRelative(3.585f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-3.885f)
                lineToRelative(-1.2f, 6f)
                horizontalLineToRelative(3.585f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-3.885f)
                lineToRelative(-1.08f, 5.397f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.47f, -0.294f)
                lineToRelative(1.02f, -5.103f)
                horizontalLineToRelative(-4.47f)
                lineToRelative(-1.08f, 5.397f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.47f, -0.294f)
                lineToRelative(1.02f, -5.103f)
                horizontalLineTo(3.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                horizontalLineToRelative(3.885f)
                lineToRelative(1.2f, -6f)
                horizontalLineTo(5.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                horizontalLineToRelative(3.885f)
                lineToRelative(1.08f, -5.397f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.882f, -0.588f)
                close()
                moveTo(10.365f, 9f)
                lineToRelative(-1.2f, 6f)
                horizontalLineToRelative(4.47f)
                lineToRelative(1.2f, -6f)
                horizontalLineToRelative(-4.47f)
                close()
            }
        }.build()

        return _Hashtag!!
    }

@Suppress("ObjectPropertyName")
private var _Hashtag: ImageVector? = null
