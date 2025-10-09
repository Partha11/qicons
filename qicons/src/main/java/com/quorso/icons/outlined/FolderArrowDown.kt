package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.FolderArrowDown: ImageVector
    get() {
        if (_FolderArrowDown != null) {
            return _FolderArrowDown!!
        }
        _FolderArrowDown = ImageVector.Builder(
            name = "Outlined.FolderArrowDown",
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
                moveToRelative(9f, 13.5f)
                lineToRelative(3f, 3f)
                moveToRelative(0f, 0f)
                lineToRelative(3f, -3f)
                moveToRelative(-3f, 3f)
                verticalLineToRelative(-6f)
                moveToRelative(1.06f, -4.19f)
                lineToRelative(-2.12f, -2.12f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.061f, -0.44f)
                horizontalLineTo(4.5f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.25f, 6f)
                verticalLineToRelative(12f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.25f, 2.25f)
                horizontalLineToRelative(15f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.75f, 18f)
                verticalLineTo(9f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.25f, -2.25f)
                horizontalLineToRelative(-5.379f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.06f, -0.44f)
                close()
            }
        }.build()

        return _FolderArrowDown!!
    }

@Suppress("ObjectPropertyName")
private var _FolderArrowDown: ImageVector? = null
